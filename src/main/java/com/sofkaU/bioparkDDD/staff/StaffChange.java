package com.sofkaU.bioparkDDD.staff;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.bioparkDDD.staff.events.*;
import com.sofkaU.bioparkDDD.staff.events.WorkAreaUpdated;

import java.util.HashSet;

public class StaffChange extends EventChange {
    public StaffChange(Staff staff) {
        apply((StaffCreated event)-> {
            staff.workArea = event.getWorkArea();
            staff.keepers = new HashSet<>();
            staff.maintenanceOperators = new HashSet<>();
        });
        apply((WorkAreaUpdated event) -> staff.workArea = event.getWorkArea());

        apply((KeeperAdded event)-> {
            var keeperNumber = staff.keepers.size();
            if (keeperNumber == 10) {
                throw new IllegalArgumentException("You can not add more keepers. You can only have 10");
            }
            staff.keepers.add(new Keeper(
                    event.getEntityId(),
                    event.getName()
            ));
        });

        apply((KeeperNameUpdated event) -> {
            var function = staff.getKeeperById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Keeper was not found"));
            function.updateName(event.getName());
        });

        apply((MaintenanceOperatorAdded event)-> {
            var maintenanceOperatorNumber = staff.maintenanceOperators.size();
            if (maintenanceOperatorNumber == 2) {
                throw new IllegalArgumentException("You can not add more maintenance operators. You can only have 2");
            }
            staff.maintenanceOperators.add(new MaintenanceOperator(
                    event.getEntityId(),
                    event.getName()
            ));
        });

        apply((MaintenanceOperatorNameUpdated event) -> {
            var function = staff.getMaintenanceOperatorById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Maintenance Operator was not found"));
            function.updateName(event.getName());
        });
    }
}

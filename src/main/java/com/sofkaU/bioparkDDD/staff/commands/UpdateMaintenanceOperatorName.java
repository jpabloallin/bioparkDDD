package com.sofkaU.bioparkDDD.staff.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.staff.values.MaintenanceOperatorId;
import com.sofkaU.bioparkDDD.staff.values.Name;
import com.sofkaU.bioparkDDD.staff.values.StaffId;

public class UpdateMaintenanceOperatorName extends Command {
    private final StaffId staffId;
    private final MaintenanceOperatorId entityId;
    private final Name name;

    public UpdateMaintenanceOperatorName(StaffId staffId, MaintenanceOperatorId entityId, Name name) {
        this.staffId = staffId;
        this.entityId = entityId;
        this.name = name;
    }

    public StaffId getStaffId() {
        return staffId;
    }

    public MaintenanceOperatorId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

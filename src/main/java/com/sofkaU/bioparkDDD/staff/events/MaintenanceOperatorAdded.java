package com.sofkaU.bioparkDDD.staff.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.staff.values.MaintenanceOperatorId;
import com.sofkaU.bioparkDDD.staff.values.Name;

public class MaintenanceOperatorAdded extends DomainEvent {
    private final MaintenanceOperatorId entityId;
    private final Name name;

    public MaintenanceOperatorAdded(MaintenanceOperatorId entityId, Name name) {
        super("biopark.staff.maintenanceoperatoradded");
        this.entityId = entityId;
        this.name = name;
    }

    public MaintenanceOperatorId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

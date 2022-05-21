package com.sofkaU.bioparkDDD.staff;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.bioparkDDD.staff.values.MaintenanceOperatorId;
import com.sofkaU.bioparkDDD.staff.values.Name;

import java.util.Objects;

public class MaintenanceOperator extends Entity<MaintenanceOperatorId> {
    private Name name;

    public MaintenanceOperator(MaintenanceOperatorId entityId, Name name) {
        super(entityId);
        this.name = name;
    }
    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }
    public Name getName() {
        return name;
    }
}

package com.sofkaU.bioparkDDD.staff.values;

import co.com.sofka.domain.generic.Identity;

public class MaintenanceOperatorId extends Identity {
    public MaintenanceOperatorId() {

    }
    private MaintenanceOperatorId(String id) {
        super(id);
    }
    public static MaintenanceOperatorId of(String id) {
        return new MaintenanceOperatorId(id);
    }
}

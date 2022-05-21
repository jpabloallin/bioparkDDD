package com.sofkaU.bioparkDDD.staff;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.bioparkDDD.educator.events.EducatorCreated;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;
import com.sofkaU.bioparkDDD.staff.values.StaffId;

import java.util.Set;

public class Staff extends AggregateEvent<StaffId> {
    protected WorkArea workArea;
    protected Set<Keeper> keepers;
    protected Set<MaintenanceOperator> maintenanceOperators;

    public Staff(StaffId entityId, WorkArea workArea) {
        super(entityId);
        appendChange(new EducatorCreated(workArea)).apply();
    }
}

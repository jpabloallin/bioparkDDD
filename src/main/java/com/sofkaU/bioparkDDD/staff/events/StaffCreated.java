package com.sofkaU.bioparkDDD.staff.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;

public class StaffCreated extends DomainEvent {
    private final WorkArea workArea;

    public StaffCreated(WorkArea workArea) {
        super("biopark.staff.staffcreated");
        this.workArea = workArea;
    }

    public WorkArea getWorkArea() {
        return workArea;
    }
}

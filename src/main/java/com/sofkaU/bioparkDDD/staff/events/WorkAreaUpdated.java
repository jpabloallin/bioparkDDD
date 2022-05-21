package com.sofkaU.bioparkDDD.staff.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;

public class WorkAreaUpdated extends DomainEvent {
    private final WorkArea workArea;

    public WorkAreaUpdated(WorkArea workArea) {
        super("biopark.staff.workareaupdated");
        this.workArea = workArea;
    }

    public WorkArea getWorkArea() {
        return workArea;
    }
}

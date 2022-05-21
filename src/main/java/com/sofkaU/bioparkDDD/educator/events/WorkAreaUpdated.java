package com.sofkaU.bioparkDDD.educator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;

public class WorkAreaUpdated extends DomainEvent {
    private final WorkArea workArea;

    public WorkAreaUpdated(WorkArea workArea) {
        super("biopark.educator.workareaupdated");
        this.workArea = workArea;
    }

    public WorkArea getWorkArea() {
        return workArea;
    }
}

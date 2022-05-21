package com.sofkaU.bioparkDDD.educator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;

public class EducatorCreated extends DomainEvent {
    private final WorkArea workArea;

    public EducatorCreated(WorkArea workArea) {
        super("biopark.educator.educatorcreated");
        this.workArea = workArea;
    }

    public WorkArea getWorkArea() {
        return workArea;
    }
}

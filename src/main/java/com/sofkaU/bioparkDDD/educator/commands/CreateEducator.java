package com.sofkaU.bioparkDDD.educator.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.educator.values.EducatorId;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;

public class CreateEducator extends Command {
    private final EducatorId entityId;
    private final WorkArea workArea;

    public CreateEducator(EducatorId entityId, WorkArea workArea) {
        this.entityId = entityId;
        this.workArea = workArea;
    }

    public EducatorId getEntityId() {
        return entityId;
    }

    public WorkArea getWorkArea() {
        return workArea;
    }
}

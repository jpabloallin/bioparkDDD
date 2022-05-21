package com.sofkaU.bioparkDDD.staff.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;
import com.sofkaU.bioparkDDD.staff.values.StaffId;

public class UpdateWorkArea extends Command {
    private final StaffId entityId;
    private final WorkArea workArea;

    public UpdateWorkArea(StaffId entityId, WorkArea workArea) {
        this.entityId = entityId;
        this.workArea = workArea;
    }

    public StaffId getEntityId() {
        return entityId;
    }

    public WorkArea getWorkArea() {
        return workArea;
    }
}

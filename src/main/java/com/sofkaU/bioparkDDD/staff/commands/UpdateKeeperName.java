package com.sofkaU.bioparkDDD.staff.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.staff.values.KeeperId;
import com.sofkaU.bioparkDDD.staff.values.Name;
import com.sofkaU.bioparkDDD.staff.values.StaffId;

public class UpdateKeeperName extends Command {
    private final StaffId staffId;
    private final KeeperId entityId;
    private final Name name;

    public UpdateKeeperName(StaffId staffId, KeeperId entityId, Name name) {
        this.staffId = staffId;
        this.entityId = entityId;
        this.name = name;
    }

    public StaffId getStaffId() {
        return staffId;
    }

    public KeeperId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

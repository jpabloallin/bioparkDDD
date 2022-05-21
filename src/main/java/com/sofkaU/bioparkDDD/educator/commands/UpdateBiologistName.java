package com.sofkaU.bioparkDDD.educator.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.educator.values.BiologistId;
import com.sofkaU.bioparkDDD.educator.values.EducatorId;
import com.sofkaU.bioparkDDD.educator.values.Name;

public class UpdateBiologistName extends Command {
    private final EducatorId educatorId;
    private final BiologistId entityId;
    private final Name name;

    public UpdateBiologistName(EducatorId educatorId, BiologistId entityId, Name name) {
        this.educatorId = educatorId;
        this.entityId = entityId;
        this.name = name;
    }

    public EducatorId getEducatorId() {
        return educatorId;
    }

    public BiologistId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

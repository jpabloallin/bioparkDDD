package com.sofkaU.bioparkDDD.educator.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.educator.values.EducatorId;
import com.sofkaU.bioparkDDD.educator.values.GuideId;
import com.sofkaU.bioparkDDD.educator.values.Name;

public class AddGuide extends Command {
    private final EducatorId educatorId;
    private final GuideId entityId;
    private final Name name;

    public AddGuide(EducatorId educatorId, GuideId entityId, Name name) {
        this.educatorId = educatorId;
        this.entityId = entityId;
        this.name = name;
    }

    public EducatorId getEducatorId() {
        return educatorId;
    }

    public GuideId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

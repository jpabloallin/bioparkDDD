package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.InstructorId;
import com.sofkaU.bioparkDDD.biome.values.Name;

public class InstructorNameUpdated extends DomainEvent {
    private final InstructorId entityId;
    private final Name name;

    public InstructorNameUpdated(InstructorId entityId, Name name) {
        super("animalsanctuary.biome.instructornameupdated");
        this.entityId = entityId;
        this.name = name;
    }

    public InstructorId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

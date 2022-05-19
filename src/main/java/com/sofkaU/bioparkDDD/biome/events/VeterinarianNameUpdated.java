package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.Name;
import com.sofkaU.bioparkDDD.biome.values.VeterinarianId;

public class VeterinarianNameUpdated extends DomainEvent {
    private final VeterinarianId entityId;
    private final Name name;

    public VeterinarianNameUpdated(VeterinarianId entityId, Name name) {
        super("animalsanctuary.biome.veterinariannameupdated");
        this.entityId = entityId;
        this.name = name;
    }

    public VeterinarianId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

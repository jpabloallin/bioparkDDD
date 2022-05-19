package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.AnimalId;
import com.sofkaU.bioparkDDD.biome.values.Name;

public class AnimalNameUpdated extends DomainEvent {

    private final AnimalId entityId;
    private final Name name;

    public AnimalNameUpdated(AnimalId entityId, Name name) {
        super("animalsanctuary.biome.animalnameupdated");
        this.entityId = entityId;
        this.name = name;
    }

    public AnimalId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

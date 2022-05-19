package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.AnimalId;
import com.sofkaU.bioparkDDD.biome.values.Name;
import com.sofkaU.bioparkDDD.biome.values.Type;

public class AnimalAdded extends DomainEvent {
    private final AnimalId entityId;
    private final Name name;
    private final Type type;

    public AnimalAdded(AnimalId entityId, Name name, Type type) {
        super("animalsanctuary.biome.animaladded");
        this.entityId = entityId;
        this.name = name;
        this.type = type;
    }

    public AnimalId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}

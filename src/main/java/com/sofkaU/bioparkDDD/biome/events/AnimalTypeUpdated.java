package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.AnimalId;
import com.sofkaU.bioparkDDD.biome.values.Type;

public class AnimalTypeUpdated  extends DomainEvent {
    private final AnimalId entityId;
    private final Type type;

    public AnimalTypeUpdated(AnimalId entityId, Type type) {
        super("animalsanctuary.biome.animaltypeupdated");
        this.entityId = entityId;
        this.type = type;
    }

    public AnimalId getEntityId() {
        return entityId;
    }

    public Type getType() {
        return type;
    }
}

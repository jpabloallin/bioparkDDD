package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.AnimalId;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.Type;

public class UpdateAnimalType extends Command {
    private final BiomeId biomeId;
    private final AnimalId entityId;
    private final Type type;

    public UpdateAnimalType(BiomeId biomeId, AnimalId entityId, Type type) {
        this.biomeId = biomeId;
        this.entityId = entityId;
        this.type = type;
    }

    public BiomeId getBiomeId() {
        return biomeId;
    }

    public AnimalId getEntityId() {
        return entityId;
    }

    public Type getType() {
        return type;
    }
}

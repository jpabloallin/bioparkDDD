package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.AnimalId;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.Name;

public class UpdateAnimalName extends Command {
    private final BiomeId biomeId;
    private final AnimalId entityId;
    private final Name name;

    public UpdateAnimalName(BiomeId biomeId, AnimalId entityId, Name name) {
        this.biomeId = biomeId;
        this.entityId = entityId;
        this.name = name;
    }

    public BiomeId getBiomeId() {
        return biomeId;
    }

    public AnimalId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

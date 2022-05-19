package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.BiomeName;
import com.sofkaU.bioparkDDD.biome.values.BiomeType;

public class CreateBiome extends Command {
    private final BiomeId entityId;
    private final BiomeName biomeName;
    private final BiomeType biomeType;

    public CreateBiome(BiomeId entityId, BiomeName biomeName, BiomeType biomeType) {
        this.entityId = entityId;
        this.biomeName = biomeName;
        this.biomeType = biomeType;
    }

    public BiomeId getEntityId() {
        return entityId;
    }

    public BiomeName getBiomeName() {
        return biomeName;
    }

    public BiomeType getBiomeType() {
        return biomeType;
    }
}


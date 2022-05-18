package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.BiomeName;
import com.sofkaU.bioparkDDD.biome.values.BiomeType;

public class BiomeCreated extends DomainEvent {

    private final BiomeName biomeName;
    private final BiomeType biomeType;

    public BiomeCreated(BiomeName biomeName, BiomeType biomeType) {
        super("animalsanctuary.biome.biomecreated");
        this.biomeName = biomeName;
        this.biomeType = biomeType;
    }

    public BiomeName getBiomeName() {
        return biomeName;
    }

    public BiomeType getBiomeType() {
        return biomeType;
    }
}

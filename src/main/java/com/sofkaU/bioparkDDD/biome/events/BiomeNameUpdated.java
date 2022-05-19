package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.BiomeName;

public class BiomeNameUpdated extends DomainEvent {
    private final BiomeName biomeName;

    public BiomeNameUpdated(BiomeName biomeName) {
        super("animalsanctuary.biome.biomenameupdated");
        this.biomeName = biomeName;
    }

    public BiomeName getBiomeName() {
        return biomeName;
    }
}

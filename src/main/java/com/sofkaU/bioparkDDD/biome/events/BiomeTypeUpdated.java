package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.BiomeName;
import com.sofkaU.bioparkDDD.biome.values.BiomeType;

public class BiomeTypeUpdated extends DomainEvent {
    private final BiomeType biomeType;

    public BiomeTypeUpdated(BiomeType biomeType) {
        super("animalsanctuary.biome.biometypeupdated");
        this.biomeType = biomeType;
    }

    public BiomeType getBiomeType() {
        return biomeType;
    }
}

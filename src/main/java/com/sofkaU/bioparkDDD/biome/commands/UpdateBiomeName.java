package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.BiomeName;

public class UpdateBiomeName extends Command {
    private final BiomeId biomeId;
    private final BiomeName biomeName;

    public UpdateBiomeName(BiomeId biomeId, BiomeName biomeName) {
        this.biomeId = biomeId;
        this.biomeName = biomeName;
    }

    public BiomeId getBiomeId() {
        return biomeId;
    }

    public BiomeName getBiomeName() {
        return biomeName;
    }
}

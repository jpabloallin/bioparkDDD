package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.BiomeType;

public class UpdateBiomeType extends Command {
    private final BiomeId biomeId;
    private final BiomeType biomeType;

    public UpdateBiomeType(BiomeId biomeId, BiomeType biomeType) {
        this.biomeId = biomeId;
        this.biomeType = biomeType;
    }

    public BiomeId getBiomeId() {
        return biomeId;
    }

    public BiomeType getBiomeType() {
        return biomeType;
    }
}

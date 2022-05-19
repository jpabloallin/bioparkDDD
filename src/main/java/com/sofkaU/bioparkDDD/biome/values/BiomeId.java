package com.sofkaU.bioparkDDD.biome.values;

import co.com.sofka.domain.generic.Identity;

public class BiomeId extends Identity {
    public BiomeId() {

    }
    private BiomeId (String id) {
        super(id);
    }

    public static BiomeId of(String id) {
        return new BiomeId(id);
    }
}

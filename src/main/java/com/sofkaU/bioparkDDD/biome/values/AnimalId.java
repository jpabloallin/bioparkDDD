package com.sofkaU.bioparkDDD.biome.values;

import co.com.sofka.domain.generic.Identity;

public class AnimalId extends Identity {
    public AnimalId() {

    }
    private AnimalId (String id) {
        super(id);
    }

    public static AnimalId of(String id) {
        return new AnimalId(id);
    }
}

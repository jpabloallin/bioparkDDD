package com.sofkaU.bioparkDDD.biome.values;

import co.com.sofka.domain.generic.Identity;

public class VeterinarianId extends Identity {
    public VeterinarianId() {

    }
    private VeterinarianId (String id) {
        super(id);
    }

    public static VeterinarianId of(String id) {
        return new VeterinarianId(id);
    }
}

package com.sofkaU.bioparkDDD.biome.values;

import co.com.sofka.domain.generic.Identity;

public class InstructorId extends Identity {
    public InstructorId() {

    }
    private InstructorId (String id) {
        super(id);
    }

    public static InstructorId of(String id) {
        return new InstructorId(id);
    }
}

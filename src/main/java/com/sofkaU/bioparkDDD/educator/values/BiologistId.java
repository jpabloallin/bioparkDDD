package com.sofkaU.bioparkDDD.educator.values;

import co.com.sofka.domain.generic.Identity;

public class BiologistId extends Identity {
    public BiologistId() {

    }
    private BiologistId(String id) {
        super(id);
    }
    public static BiologistId of(String id) {
        return new BiologistId(id);
    }
}

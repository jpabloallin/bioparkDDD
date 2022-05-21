package com.sofkaU.bioparkDDD.staff.values;

import co.com.sofka.domain.generic.Identity;

public class KeeperId extends Identity {
    public KeeperId() {

    }
    private KeeperId(String id) {
        super(id);
    }
    public static KeeperId of(String id) {
        return new KeeperId(id);
    }
}

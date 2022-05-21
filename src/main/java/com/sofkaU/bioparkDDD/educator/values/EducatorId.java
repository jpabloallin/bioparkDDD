package com.sofkaU.bioparkDDD.educator.values;

import co.com.sofka.domain.generic.Identity;

public class EducatorId extends Identity {
    public EducatorId() {

    }
    private EducatorId(String id) {
        super(id);
    }
    public static EducatorId of(String id) {
        return new EducatorId(id);
    }
}

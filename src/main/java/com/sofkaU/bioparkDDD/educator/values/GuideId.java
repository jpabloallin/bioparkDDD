package com.sofkaU.bioparkDDD.educator.values;

import co.com.sofka.domain.generic.Identity;

public class GuideId extends Identity {
    public GuideId() {

    }
    private GuideId(String id) {
        super(id);
    }
    public static GuideId of(String id) {
        return new GuideId(id);
    }
}

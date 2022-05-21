package com.sofkaU.bioparkDDD.educator;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.bioparkDDD.educator.values.GuideId;
import com.sofkaU.bioparkDDD.educator.values.Name;

import java.util.Objects;

public class Guide extends Entity<GuideId> {
    private Name name;

    public Guide(GuideId entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }
    public Name name() {
        return name;
    }
}

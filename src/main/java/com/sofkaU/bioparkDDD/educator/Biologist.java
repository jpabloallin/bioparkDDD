package com.sofkaU.bioparkDDD.educator;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.bioparkDDD.educator.values.BiologistId;
import com.sofkaU.bioparkDDD.educator.values.Name;

import java.util.Objects;

public class Biologist extends Entity<BiologistId> {
    private Name name;

    public Biologist(BiologistId entityId, Name name) {
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

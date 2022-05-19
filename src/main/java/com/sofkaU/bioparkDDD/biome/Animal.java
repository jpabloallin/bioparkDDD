package com.sofkaU.bioparkDDD.biome;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.bioparkDDD.biome.values.AnimalId;
import com.sofkaU.bioparkDDD.biome.values.Name;
import com.sofkaU.bioparkDDD.biome.values.Type;

import java.util.Objects;

public class Animal extends Entity<AnimalId> {

    private Name name;
    private Type type;

    public Animal(AnimalId entityId, Name name, Type type) {
        super(entityId);
        this.name = name;
        this.type = type;
    }

    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void updateType(Type type) {
        this.type = Objects.requireNonNull(type);
    }

    public Name name() {
        return name;
    }

    public Type type() {
        return type;
    }
}

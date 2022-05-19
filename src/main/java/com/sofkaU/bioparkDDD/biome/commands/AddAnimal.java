package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.AnimalId;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.Name;
import com.sofkaU.bioparkDDD.biome.values.Type;

public class AddAnimal extends Command {
    private final BiomeId biomeId;
    private final AnimalId entityId;
    private final Name name;
    private final Type type;

    public AddAnimal(BiomeId biomeId, AnimalId entityId, Name name, Type type) {
        this.biomeId = biomeId;
        this.entityId = entityId;
        this.name = name;
        this.type = type;
    }

    public BiomeId getBiomeId() {
        return biomeId;
    }

    public AnimalId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}

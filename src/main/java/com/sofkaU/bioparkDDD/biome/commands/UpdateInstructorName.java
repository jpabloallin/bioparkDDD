package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.InstructorId;
import com.sofkaU.bioparkDDD.biome.values.Name;

public class UpdateInstructorName extends Command {
    private final BiomeId biomeId;
    private final InstructorId entityId;
    private final Name name;

    public UpdateInstructorName(BiomeId biomeId, InstructorId entityId, Name name) {
        this.biomeId = biomeId;
        this.entityId = entityId;
        this.name = name;
    }

    public BiomeId getBiomeId() {
        return biomeId;
    }

    public InstructorId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

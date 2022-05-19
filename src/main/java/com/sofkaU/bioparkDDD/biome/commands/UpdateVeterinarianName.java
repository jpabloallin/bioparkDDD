package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.Name;
import com.sofkaU.bioparkDDD.biome.values.VeterinarianId;

public class UpdateVeterinarianName extends Command {
    private final BiomeId biomeId;
    private final VeterinarianId entityId;
    private final Name name;

    public UpdateVeterinarianName(BiomeId biomeId, VeterinarianId entityId, Name name) {
        this.biomeId = biomeId;
        this.entityId = entityId;
        this.name = name;
    }

    public BiomeId getBiomeId() {
        return biomeId;
    }

    public VeterinarianId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

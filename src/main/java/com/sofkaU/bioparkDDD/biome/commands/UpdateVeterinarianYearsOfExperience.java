package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.VeterinarianId;
import com.sofkaU.bioparkDDD.biome.values.YearsOfExperience;

public class UpdateVeterinarianYearsOfExperience extends Command {
    private final BiomeId biomeId;
    private final VeterinarianId entityId;
    private final YearsOfExperience yearsOfExperience;

    public UpdateVeterinarianYearsOfExperience(BiomeId biomeId, VeterinarianId entityId, YearsOfExperience yearsOfExperience) {
        this.biomeId = biomeId;
        this.entityId = entityId;
        this.yearsOfExperience = yearsOfExperience;
    }

    public BiomeId getBiomeId() {
        return biomeId;
    }

    public VeterinarianId getEntityId() {
        return entityId;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

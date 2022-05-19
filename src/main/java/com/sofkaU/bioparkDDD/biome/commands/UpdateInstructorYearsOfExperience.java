package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.InstructorId;
import com.sofkaU.bioparkDDD.biome.values.YearsOfExperience;

public class UpdateInstructorYearsOfExperience extends Command {
    private final BiomeId biomeId;
    private final InstructorId entityId;
    private final YearsOfExperience yearsOfExperience;

    public UpdateInstructorYearsOfExperience(BiomeId biomeId, InstructorId entityId, YearsOfExperience yearsOfExperience) {
        this.biomeId = biomeId;
        this.entityId = entityId;
        this.yearsOfExperience = yearsOfExperience;
    }

    public BiomeId getBiomeId() {
        return biomeId;
    }

    public InstructorId getEntityId() {
        return entityId;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

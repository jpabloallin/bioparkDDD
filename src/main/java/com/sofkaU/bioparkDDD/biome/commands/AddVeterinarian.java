package com.sofkaU.bioparkDDD.biome.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.Name;
import com.sofkaU.bioparkDDD.biome.values.VeterinarianId;
import com.sofkaU.bioparkDDD.biome.values.YearsOfExperience;

public class AddVeterinarian extends Command {
    private final BiomeId biomeId;
    private final VeterinarianId entityId;
    private final Name name;
    private final YearsOfExperience yearsOfExperience;

    public AddVeterinarian(BiomeId biomeId, VeterinarianId entityId, Name name, YearsOfExperience yearsOfExperience) {
        this.biomeId = biomeId;
        this.entityId = entityId;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
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

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

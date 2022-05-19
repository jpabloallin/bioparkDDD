package com.sofkaU.bioparkDDD.biome;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.bioparkDDD.biome.values.Name;
import com.sofkaU.bioparkDDD.biome.values.VeterinarianId;
import com.sofkaU.bioparkDDD.biome.values.YearsOfExperience;

import java.util.Objects;

public class Veterinarian extends Entity<VeterinarianId> {

    private Name name;
    private YearsOfExperience yearsOfExperience;

    public Veterinarian(VeterinarianId entityId, Name name, YearsOfExperience yearsOfExperience) {
        super(entityId);
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void updateYearsOfExperience(YearsOfExperience yearsOfExperience) {
        this.yearsOfExperience = Objects.requireNonNull(yearsOfExperience);
    }

    public Name name() {
        return name;
    }

    public YearsOfExperience yearsOfExperience() {
        return yearsOfExperience;
    }
}

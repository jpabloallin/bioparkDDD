package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.VeterinarianId;
import com.sofkaU.bioparkDDD.biome.values.YearsOfExperience;

public class VeterinarianYearsOfExperienceUpdated  extends DomainEvent {
    private final VeterinarianId entityId;
    private final YearsOfExperience yearsOfExperience;

    public VeterinarianYearsOfExperienceUpdated(VeterinarianId entityId, YearsOfExperience yearsOfExperience) {
        super("animalsanctuary.biome.veterinarianyearsofexperienceupdated");
        this.entityId = entityId;
        this.yearsOfExperience = yearsOfExperience;
    }

    public VeterinarianId getEntityId() {
        return entityId;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

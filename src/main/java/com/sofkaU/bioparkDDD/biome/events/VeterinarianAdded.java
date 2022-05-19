package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.Name;
import com.sofkaU.bioparkDDD.biome.values.VeterinarianId;
import com.sofkaU.bioparkDDD.biome.values.YearsOfExperience;

public class VeterinarianAdded extends DomainEvent {
    private final VeterinarianId entityId;
    private final Name name;
    private final YearsOfExperience yearsOfExperience;

    public VeterinarianAdded(VeterinarianId entityId, Name name, YearsOfExperience yearsOfExperience) {
        super("animalsanctuary.biome.veterinarianadded");
        this.entityId = entityId;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
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

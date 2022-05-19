package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.InstructorId;
import com.sofkaU.bioparkDDD.biome.values.Name;
import com.sofkaU.bioparkDDD.biome.values.YearsOfExperience;

public class InstructorAdded extends DomainEvent {
    private final InstructorId entityId;
    private final Name name;
    private final YearsOfExperience yearsOfExperience;

    public InstructorAdded(InstructorId entityId, Name name, YearsOfExperience yearsOfExperience) {
        super("animalsanctuary.biome.instructoradded");
        this.entityId = entityId;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public InstructorId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

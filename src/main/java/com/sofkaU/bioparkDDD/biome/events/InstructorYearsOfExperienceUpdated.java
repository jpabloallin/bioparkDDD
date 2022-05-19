package com.sofkaU.bioparkDDD.biome.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.values.InstructorId;
import com.sofkaU.bioparkDDD.biome.values.YearsOfExperience;

public class InstructorYearsOfExperienceUpdated extends DomainEvent {
    private final InstructorId entityId;
    private final YearsOfExperience yearsOfExperience;

    public InstructorYearsOfExperienceUpdated(InstructorId entityId, YearsOfExperience yearsOfExperience) {
        super("animalsanctuary.biome.instructoryearsofexperienceupdated");
        this.entityId = entityId;
        this.yearsOfExperience = yearsOfExperience;
    }

    public InstructorId getEntityId() {
        return entityId;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }
}

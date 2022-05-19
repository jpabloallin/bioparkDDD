package com.sofkaU.bioparkDDD.biome;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.bioparkDDD.biome.events.*;
import com.sofkaU.bioparkDDD.biome.values.*;

import java.util.Objects;
import java.util.Set;

public class Biome extends AggregateEvent<BiomeId> {

    protected BiomeName biomeName;
    protected BiomeType biomeType;
    protected Set<Animal> animals;
    protected Set<Instructor> instructors;
    protected Set<Veterinarian> veterinarians;

    public Biome(BiomeId entityId, BiomeName biomeName, BiomeType biomeType) {
        super(entityId);
        appendChange(new BiomeCreated(biomeName, biomeType)).apply();
    }

    public void addAnimal(AnimalId entityId, Name name, Type type) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(type);
        appendChange(new AnimalAdded(entityId, name, type)).apply();
    }

    public void addInstructor(InstructorId entityId, Name name, YearsOfExperience yearsOfExperience) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(yearsOfExperience);
        appendChange(new InstructorAdded(entityId, name, yearsOfExperience));
    }

    public void addVeterinarian(VeterinarianId entityId, Name name, YearsOfExperience yearsOfExperience) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(yearsOfExperience);
        appendChange(new VeterinarianAdded(entityId, name, yearsOfExperience));
    }

    public void updateBiomeName(BiomeName biomeName) {
        appendChange(new BiomeNameUpdated(biomeName)).apply();
    }

    public void updateBiomeType(BiomeType biomeType) {
        appendChange(new BiomeTypeUpdated(biomeType)).apply();
    }

}

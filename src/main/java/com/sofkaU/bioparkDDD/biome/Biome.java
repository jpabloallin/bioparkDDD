package com.sofkaU.bioparkDDD.biome;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.biome.events.*;
import com.sofkaU.bioparkDDD.biome.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Biome extends AggregateEvent<BiomeId> {

    protected BiomeName biomeName;
    protected BiomeType biomeType;
    protected Set<Animal> animals;
    protected Set<Instructor> instructors;
    protected Set<Veterinarian> veterinarians;

    /**
     * Creates aggregate Biome
     * */
    public Biome(BiomeId entityId, BiomeName biomeName, BiomeType biomeType) {
        super(entityId);
        appendChange(new BiomeCreated(biomeName, biomeType)).apply();
    }

    //Constructor privado para afectar estados, suscripción de los eventos
    //Está pendiente de los eventos para poder cambiar los estados del agregado
    private Biome(BiomeId entityId) {
        super(entityId);
        subscribe(new BiomeChange(this));
    }

    /**
     * Factory that allows me to build the object Biome
     * It's a way to obtain an aggregates with events that's already saved.
     **/
    public static Biome from(BiomeId entityId, List<DomainEvent> events) {
        var biome = new Biome(entityId);
        events.forEach(biome::applyEvent);
        return biome;
    }

    /*
    * Behaviors
    */
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

    public void updateAnimalName(AnimalId entityId, Name name) {
        appendChange(new AnimalNameUpdated(entityId, name)).apply();
    }

    public void updateAnimalType(AnimalId entityId, Type type) {
        appendChange(new AnimalTypeUpdated(entityId, type)).apply();
    }

    public void updateInstructorName(InstructorId entityId, Name name) {
        appendChange(new InstructorNameUpdated(entityId, name)).apply();
    }

    public void updateInstructorYearsOfExperience(InstructorId entityId, YearsOfExperience yearsOfExperience) {
        appendChange(new InstructorYearsOfExperienceUpdated(entityId, yearsOfExperience)).apply();
    }

    public void updateVeterinarianName(VeterinarianId entityId, Name name) {
        appendChange(new VeterinarianNameUpdated(entityId, name)).apply();
    }

    public void updateVeterinarianYearsOfExperience(VeterinarianId entityId, YearsOfExperience yearsOfExperience) {
        appendChange(new VeterinarianYearsOfExperienceUpdated(entityId, yearsOfExperience)).apply();
    }

    protected Optional<Animal> getAnimalById(AnimalId entityId) {
        return animals()
                .stream()
                .filter(animal -> animal.identity().equals(entityId))
                .findFirst();
    }

    protected Optional<Instructor> getInstructorById(InstructorId entityId) {
        return instructors()
                .stream()
                .filter(instructor -> instructor.identity().equals(entityId))
                .findFirst();
    }

    protected Optional<Veterinarian> getVeterinarianById(VeterinarianId entityId) {
        return veterinarians()
                .stream()
                .filter(veterinarian -> veterinarian.identity().equals(entityId))
                .findFirst();
    }
    public BiomeName biomeName() {
        return biomeName;
    }

    public BiomeType biomeType() {
        return biomeType;
    }

    public Set<Animal> animals() {
        return animals;
    }

    public Set<Instructor> instructors() {
        return instructors;
    }

    public Set<Veterinarian> veterinarians() {
        return veterinarians;
    }
}

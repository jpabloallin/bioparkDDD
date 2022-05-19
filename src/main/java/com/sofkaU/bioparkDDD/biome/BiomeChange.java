package com.sofkaU.bioparkDDD.biome;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.bioparkDDD.biome.events.*;

import java.util.HashSet;

public class BiomeChange extends EventChange {
    //Apply each domain event that is on the aggregate(inital states)
    public BiomeChange(Biome biome) {

        apply((BiomeCreated event) -> {
            biome.biomeName = event.getBiomeName();
            biome.biomeType = event.getBiomeType();
            biome.animals = new HashSet<>();
            biome.instructors = new HashSet<>();
            biome.veterinarians = new HashSet<>();
        });

        apply((BiomeNameUpdated event) -> biome.biomeName = event.getBiomeName());

        apply((BiomeTypeUpdated event) -> biome.biomeType = event.getBiomeType());

        apply((AnimalAdded event) -> {
            var animalNumber = biome.animals().size();
            if (animalNumber == 10) {
                throw new IllegalArgumentException("You can not add more animals. You can only have 10 animals");
            }
            biome.animals.add(new Animal(
                    event.getEntityId(),
                    event.getName(),
                    event.getType()
            ));
        });

        apply((AnimalNameUpdated event) -> {
            var function = biome.getAnimalById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Biome's animal was not found"));
            function.updateName(event.getName());
        });

        apply((AnimalTypeUpdated event) -> {
            var function = biome.getAnimalById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Biome's animal was not found"));
            function.updateType(event.getType());
        });

        apply((InstructorNameUpdated event) -> {
            var function = biome.getInstructorById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Biome's instructor was not found"));
            function.updateName(event.getName());
        });

        apply((InstructorYearsOfExperienceUpdated event) -> {
            var function = biome.getInstructorById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Biome's instructor was not found"));
            function.updateYearsOfExperience(event.getYearsOfExperience());
        });

        apply((VeterinarianNameUpdated event) -> {
            var function = biome.getVeterinarianById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Biome's veterinarian was not found"));
            function.updateName(event.getName());
        });

        apply((VeterinarianYearsOfExperienceUpdated event) -> {
            var function = biome.getVeterinarianById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Biome's veterinarian was not found"));
            function.updateYearsOfExperience(event.getYearsOfExperience());
        });
    }
}

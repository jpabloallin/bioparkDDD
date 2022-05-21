package com.sofkaU.bioparkDDD.useCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaU.bioparkDDD.biome.commands.CreateBiome;
import com.sofkaU.bioparkDDD.biome.events.BiomeCreated;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.BiomeName;
import com.sofkaU.bioparkDDD.biome.values.BiomeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateBiomeUseCaseTest {

    @Test
    void createBiomeWithAllTheParameters() {
        //Arrange
        var command = new CreateBiome(
                BiomeId.of("v111"),
                new BiomeName("Sabana Park"),
                new BiomeType("Sabana")
        );

        var useCase = new CreateBiomeUseCase();
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong creating the biome"))
                .getDomainEvents();

        //Assert
        var event = (BiomeCreated)events.get(0);
        Assertions.assertEquals(command.getBiomeName().value(), event.getBiomeName().value());
        Assertions.assertEquals(command.getBiomeType().value(), event.getBiomeType().value());
    }
}
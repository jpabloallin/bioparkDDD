package com.sofkaU.bioparkDDD.useCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaU.bioparkDDD.educator.commands.CreateEducator;
import com.sofkaU.bioparkDDD.educator.events.EducatorCreated;
import com.sofkaU.bioparkDDD.educator.values.EducatorId;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateEducatorUseCaseTest {
    @Test
    void createEducatorWithAllTheParameters() {
        //Arrange
        var command = new CreateEducator(
                EducatorId.of("E111"),
                new WorkArea("Sabana")
        );

        var useCase = new CreateEducatorUseCase();
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong while creating the educator"))
                .getDomainEvents();

        //Assert
        var event = (EducatorCreated)events.get(0);
        Assertions.assertEquals(command.getWorkArea().value(), event.getWorkArea().value());
    }
}
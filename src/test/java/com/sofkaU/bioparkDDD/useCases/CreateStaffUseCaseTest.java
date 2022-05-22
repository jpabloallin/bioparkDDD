package com.sofkaU.bioparkDDD.useCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;
import com.sofkaU.bioparkDDD.staff.commands.CreateStaff;
import com.sofkaU.bioparkDDD.staff.events.StaffCreated;
import com.sofkaU.bioparkDDD.staff.values.StaffId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateStaffUseCaseTest {
    @Test
    void createStaffWithAllTheParameters() {
        //Arrange
        var command = new CreateStaff(
                StaffId.of("S111"),
                new WorkArea("Jungle")
        );

        var useCase = new CreateStaffUseCase();
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()-> new IllegalArgumentException("Something went wrong while creating the staff"))
                .getDomainEvents();

        //Assert
        var event = (StaffCreated)events.get(0);
        Assertions.assertEquals(command.getWorkArea().value(), event.getWorkArea().value());
    }
}
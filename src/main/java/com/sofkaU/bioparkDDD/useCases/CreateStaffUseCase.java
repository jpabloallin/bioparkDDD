package com.sofkaU.bioparkDDD.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.bioparkDDD.staff.Staff;
import com.sofkaU.bioparkDDD.staff.commands.CreateStaff;

public class CreateStaffUseCase extends UseCase<RequestCommand<CreateStaff>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateStaff> createStaffRequestCommand) {
        var command = createStaffRequestCommand.getCommand();
        var staff = new Staff(
                command.getEntityId(),
                command.getWorkArea()
        );
        emit().onResponse(new ResponseEvents(staff.getUncommittedChanges()));
    }
}

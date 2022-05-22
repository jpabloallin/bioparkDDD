package com.sofkaU.bioparkDDD.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.bioparkDDD.educator.Educator;
import com.sofkaU.bioparkDDD.educator.commands.CreateEducator;

public class CreateEducatorUseCase extends UseCase<RequestCommand<CreateEducator>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateEducator> createEducatorRequestCommand) {
        var command = createEducatorRequestCommand.getCommand();
        var educator = new Educator(
                command.getEntityId(),
                command.getWorkArea()
        );
        emit().onResponse(new ResponseEvents(educator.getUncommittedChanges()));
    }
}

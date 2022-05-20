package com.sofkaU.bioparkDDD.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.bioparkDDD.biome.Biome;
import com.sofkaU.bioparkDDD.biome.commands.AddAnimal;

public class AddAnimalUseCase extends UseCase<RequestCommand<AddAnimal>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddAnimal> addAnimalRequestCommand) {
        var command = addAnimalRequestCommand.getCommand();
        var biome = Biome.from(command.getBiomeId(), retrieveEvents(command.getBiomeId().value()));
        biome.addAnimal(command.getEntityId(), command.getName(), command.getType());

        emit().onResponse(new ResponseEvents(biome.getUncommittedChanges()));
    }
}

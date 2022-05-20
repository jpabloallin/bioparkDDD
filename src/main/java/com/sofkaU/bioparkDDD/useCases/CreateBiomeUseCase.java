package com.sofkaU.bioparkDDD.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.bioparkDDD.biome.Biome;
import com.sofkaU.bioparkDDD.biome.commands.CreateBiome;

public class CreateBiomeUseCase extends UseCase<RequestCommand<CreateBiome>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateBiome> createBiomeRequestCommand) {
        var command = createBiomeRequestCommand.getCommand();
        var biome = new Biome(
                command.getEntityId(),
                command.getBiomeName(),
                command.getBiomeType()
        );
        emit().onResponse(new ResponseEvents(biome.getUncommittedChanges()));
    }
}

package com.sofkaU.bioparkDDD.educator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.educator.values.BiologistId;
import com.sofkaU.bioparkDDD.educator.values.Name;

public class BiologistNameUpdated extends DomainEvent {
    private final BiologistId entityId;
    private final Name name;

    public BiologistNameUpdated(BiologistId entityId, Name name) {
        super("biopark.educator.biologistnameupdated");
        this.entityId = entityId;
        this.name = name;
    }

    public BiologistId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

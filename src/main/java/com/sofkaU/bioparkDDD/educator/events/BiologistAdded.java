package com.sofkaU.bioparkDDD.educator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.educator.values.BiologistId;
import com.sofkaU.bioparkDDD.educator.values.Name;

public class BiologistAdded extends DomainEvent {
    private final BiologistId entityId;
    private final Name name;

    public BiologistAdded(BiologistId entityId, Name name) {
        super("biopark.educator.biologistadded");
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

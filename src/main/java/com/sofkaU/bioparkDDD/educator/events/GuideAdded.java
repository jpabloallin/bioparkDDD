package com.sofkaU.bioparkDDD.educator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.educator.values.GuideId;
import com.sofkaU.bioparkDDD.educator.values.Name;

public class GuideAdded extends DomainEvent {
    private final GuideId entityId;
    private final Name name;

    public GuideAdded(GuideId entityId, Name name) {
        super("biopark.educator.guideadded");
        this.entityId = entityId;
        this.name = name;
    }

    public GuideId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

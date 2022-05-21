package com.sofkaU.bioparkDDD.staff.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.staff.values.KeeperId;
import com.sofkaU.bioparkDDD.staff.values.Name;

public class KeeperNameUpdated extends DomainEvent {
    private final KeeperId entityId;
    private final Name name;

    public KeeperNameUpdated(KeeperId entityId, Name name) {
        super("biopark.staff.keepernameupdated");
        this.entityId = entityId;
        this.name = name;
    }

    public KeeperId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}

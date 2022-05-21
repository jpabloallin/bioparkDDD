package com.sofkaU.bioparkDDD.staff.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.bioparkDDD.staff.values.KeeperId;
import com.sofkaU.bioparkDDD.staff.values.Name;

public class KeeperAdded extends DomainEvent {
    private final KeeperId entityId;
    private final Name name;

    public KeeperAdded(KeeperId entityId, Name name) {
        super("biopark.staff.keeperadded");
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

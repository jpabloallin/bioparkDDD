package com.sofkaU.bioparkDDD.staff;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.bioparkDDD.staff.values.KeeperId;
import com.sofkaU.bioparkDDD.staff.values.Name;

import java.util.Objects;

public class Keeper extends Entity<KeeperId> {
    private Name name;

    public Keeper(KeeperId entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }
    public Name getName() {
        return name;
    }
}

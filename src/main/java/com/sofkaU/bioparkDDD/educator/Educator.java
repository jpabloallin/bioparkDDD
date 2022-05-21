package com.sofkaU.bioparkDDD.educator;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.bioparkDDD.educator.events.EducatorCreated;
import com.sofkaU.bioparkDDD.educator.values.EducatorId;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;

import java.util.Set;

public class Educator extends AggregateEvent<EducatorId> {
    protected WorkArea workArea;
    protected Set<Guide> guides;
    protected Set<Biologist> biologists;

    public Educator(EducatorId entityId, WorkArea workArea) {
        super(entityId);
        appendChange(new EducatorCreated(workArea)).apply();
    }

}

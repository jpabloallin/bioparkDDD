package com.sofkaU.bioparkDDD.educator;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.bioparkDDD.educator.events.EducatorCreated;
import com.sofkaU.bioparkDDD.educator.values.BiologistId;
import com.sofkaU.bioparkDDD.educator.values.EducatorId;
import com.sofkaU.bioparkDDD.educator.values.GuideId;
import com.sofkaU.bioparkDDD.educator.values.Name;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;

import java.util.Objects;
import java.util.Set;

public class Educator extends AggregateEvent<EducatorId> {
    protected WorkArea workArea;
    protected Set<Guide> guides;
    protected Set<Biologist> biologists;

    public Educator(EducatorId entityId, WorkArea workArea) {
        super(entityId);
        appendChange(new EducatorCreated(workArea)).apply();
    }
    public void updateWorkArea(WorkArea workArea) {
        appendChange(new WorkAreaUpdated(workArea)).apply();
    }
    public void addBiologist(BiologistId entityId, Name name) {
        appendChange(new BiologistAdded(entityId, name)).apply();
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
    }
    public void updateBiologistName(BiologistId entityId, Name name) {
        appendChange(new BiologistNameUpdated(entityId, name)).apply();
    }
    public void addGuide(GuideId entityId, Name name) {
        appendChange(new GuideAdded(entityId, name)).apply();
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
    }
    public void updateGuideName(BiologistId entityId, Name name) {
        appendChange(new GuideNameUpdated(entityId, name)).apply();
    }

}

package com.sofkaU.bioparkDDD.staff;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.bioparkDDD.educator.events.EducatorCreated;
import com.sofkaU.bioparkDDD.educator.values.BiologistId;
import com.sofkaU.bioparkDDD.sharedvalueobjects.WorkArea;
import com.sofkaU.bioparkDDD.staff.values.KeeperId;
import com.sofkaU.bioparkDDD.staff.values.MaintenanceOperatorId;
import com.sofkaU.bioparkDDD.staff.values.Name;
import com.sofkaU.bioparkDDD.staff.values.StaffId;

import java.util.Objects;
import java.util.Set;

public class Staff extends AggregateEvent<StaffId> {
    protected WorkArea workArea;
    protected Set<Keeper> keepers;
    protected Set<MaintenanceOperator> maintenanceOperators;

    public Staff(StaffId entityId, WorkArea workArea) {
        super(entityId);
        appendChange(new EducatorCreated(workArea)).apply();
    }
    public void updateWorkArea(WorkArea workArea) {
        appendChange(new WorkAreaUpdated(workArea)).apply();
    }
    public void addKeeper(KeeperId entityId, Name name) {
        appendChange(new KeeperAdded(entityId, name)).apply();
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
    }
    public void updateKeeperName(KeeperId entityId, Name name) {
        appendChange(new KeeperNameUpdated(entityId, name)).apply();
    }
    public void addMaintenanceOperator(MaintenanceOperatorId entityId, Name name) {
        appendChange(new MaintenanceOperatorAdded(entityId, name)).apply();
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
    }
    public void updateMaintenanceOperatorName(MaintenanceOperatorId entityId, Name name) {
        appendChange(new MaintenanceOperatorNameUpdated(entityId, name)).apply();
    }
}

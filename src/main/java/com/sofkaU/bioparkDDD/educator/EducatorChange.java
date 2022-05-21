package com.sofkaU.bioparkDDD.educator;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.bioparkDDD.educator.events.*;

import java.util.HashSet;

public class EducatorChange extends EventChange {
    public EducatorChange(Educator educator) {
        apply((EducatorCreated event)-> {
            educator.workArea = event.getWorkArea();
            educator.biologists = new HashSet<>();
            educator.guides = new HashSet<>();
        });
        apply((WorkAreaUpdated event) -> educator.workArea = event.getWorkArea());

        apply((BiologistAdded event)-> {
            var biologistNumber = educator.biologists.size();
            if (biologistNumber == 2) {
                throw new IllegalArgumentException("You can not add more biologists. You can only have 2");
            }
            educator.biologists.add(new Biologist(
                    event.getEntityId(),
                    event.getName()
            ));
        });

        apply((BiologistNameUpdated event) -> {
            var function = educator.getBiologistById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Biologist was not found"));
            function.updateName(event.getName());
        });
        apply((GuideAdded event)-> {
            var guideNumber = educator.guides.size();
            if (guideNumber == 10) {
                throw new IllegalArgumentException("You can not add more guides. You can only have 10");
            }
            educator.guides.add(new Guide(
                    event.getEntityId(),
                    event.getName()
            ));
        });

        apply((GuideNameUpdated event) -> {
            var function = educator.getGuideById(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("Guide was not found"));
            function.updateName(event.getName());
        });
    }
}

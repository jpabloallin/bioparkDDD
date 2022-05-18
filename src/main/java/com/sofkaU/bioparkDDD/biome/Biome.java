package com.sofkaU.bioparkDDD.biome;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.bioparkDDD.biome.values.BiomeId;
import com.sofkaU.bioparkDDD.biome.values.BiomeName;
import com.sofkaU.bioparkDDD.biome.values.BiomeType;

import java.util.Set;

public class Biome extends AggregateEvent<BiomeId> {

    protected BiomeName biomeName;
    protected BiomeType biomeType;
    protected Set<Animal> animals;
    protected Set<Instructor> instructors;
    protected Set<Veterinarian> veterinarians;

    public Biome(BiomeId entityId, BiomeName biomeName, BiomeType biomeType) {
        super(entityId);
    }
}

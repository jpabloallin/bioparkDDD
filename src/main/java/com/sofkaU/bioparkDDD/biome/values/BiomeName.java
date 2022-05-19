package com.sofkaU.bioparkDDD.biome.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class BiomeName implements ValueObject<String> {
    private final String value;
    public BiomeName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("Biome name can not be empty");
        }
        if (this.value.length() <= 4) {
            throw new IllegalArgumentException("Biome name must have more than 4 characters");
        }
    }
    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiomeName biomeName = (BiomeName) o;
        return value.equals(biomeName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

package com.sofkaU.bioparkDDD.biome.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class BiomeType implements ValueObject<String> {
    private final String value;
    public BiomeType(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Biome type can not be empty");
        }
        if (this.value.length() <= 5) {
            throw new IllegalArgumentException("Biome ype must have more than 5 characters");
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
        BiomeType biomeType = (BiomeType) o;
        return Objects.equals(value, biomeType.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

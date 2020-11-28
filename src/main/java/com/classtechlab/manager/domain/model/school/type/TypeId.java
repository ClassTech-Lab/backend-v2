package com.classtechlab.manager.domain.model.school.type;

import java.util.UUID;

public class TypeId {
    private final UUID value;

    public TypeId(final UUID value) {
        this.value = value;
    }

    public TypeId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TypeId that = (TypeId) o;

        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

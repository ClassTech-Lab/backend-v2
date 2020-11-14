package com.classtechlab.manager.domain.model.schooltype;

import java.util.UUID;

public class SchoolTypeId {
    private final UUID value;

    public SchoolTypeId(final UUID value) {
        this.value = value;
    }

    public SchoolTypeId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final SchoolTypeId that = (SchoolTypeId) o;

        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

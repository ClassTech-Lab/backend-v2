package com.classtechlab.manager.domain.model.school;

import java.util.UUID;

public class SchoolId {
    private final UUID value;

    private SchoolId(final UUID value) {
        this.value = value;
    }

    SchoolId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final SchoolId schoolId = (SchoolId) o;

        return value.equals(schoolId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

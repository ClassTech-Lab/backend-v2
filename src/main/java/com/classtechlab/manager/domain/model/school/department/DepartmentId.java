package com.classtechlab.manager.domain.model.school.department;

import java.util.UUID;

/**
 * 学科ID
 */
public class DepartmentId {
    private final UUID value;

    public DepartmentId(final UUID value) {
        this.value = value;
    }

    public DepartmentId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final DepartmentId that = (DepartmentId) o;

        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

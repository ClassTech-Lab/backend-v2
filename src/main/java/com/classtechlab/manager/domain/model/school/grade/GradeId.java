package com.classtechlab.manager.domain.model.school.grade;

import java.util.UUID;

/**
 * 学年ID
 */
public class GradeId {
    private final UUID value;

    public GradeId(final UUID value) {
        this.value = value;
    }

    public GradeId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final GradeId gradeId = (GradeId) o;

        return value.equals(gradeId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

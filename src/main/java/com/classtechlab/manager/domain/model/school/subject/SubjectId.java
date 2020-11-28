package com.classtechlab.manager.domain.model.school.subject;

import java.util.UUID;

public class SubjectId {
    private final UUID value;

    public SubjectId(final UUID value) {
        this.value = value;
    }
    public SubjectId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final SubjectId subjectId = (SubjectId) o;

        return value.equals(subjectId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

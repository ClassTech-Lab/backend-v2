package com.classtechlab.manager.domain.model.practice;

import java.util.UUID;

public class PracticeId {
    private final UUID value;

    public PracticeId(final UUID value) {
        this.value = value;
    }

    public PracticeId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final PracticeId that = (PracticeId) o;

        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

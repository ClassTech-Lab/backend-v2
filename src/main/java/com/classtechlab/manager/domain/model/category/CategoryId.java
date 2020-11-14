package com.classtechlab.manager.domain.model.category;

import java.util.UUID;

public class CategoryId {
    private final UUID value;

    public CategoryId(final UUID value) {
        this.value = value;
    }

    public CategoryId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final CategoryId that = (CategoryId) o;

        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

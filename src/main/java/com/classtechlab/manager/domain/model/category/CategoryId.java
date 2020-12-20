package com.classtechlab.manager.domain.model.category;

import java.util.UUID;

public class CategoryId {
    UUID value;

    CategoryId(final UUID value) {
        this.value = value;
    }

    CategoryId() {
        this(UUID.randomUUID());
    }

    UUID value() {
        return this.value;
    }

    boolean isEqualTo(final CategoryId other) {
        return this.value.equals(other.value);
    }
}

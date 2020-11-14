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
}

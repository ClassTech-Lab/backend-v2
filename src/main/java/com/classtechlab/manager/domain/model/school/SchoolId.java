package com.classtechlab.manager.domain.model.school;

import java.util.UUID;

public class SchoolId {
    private final UUID value;

    public SchoolId(final UUID value) {
        this.value = value;
    }

    public SchoolId() {
        this(UUID.randomUUID());
    }
}

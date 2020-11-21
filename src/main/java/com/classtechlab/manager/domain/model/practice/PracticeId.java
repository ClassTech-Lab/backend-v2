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
}

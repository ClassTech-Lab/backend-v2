package com.classtechlab.manager.domain.model.keyword;

import java.util.UUID;

public class KeywordId {
    private final UUID value;

    public KeywordId(final UUID value) {
        this.value = value;
    }

    public KeywordId() {
        this(UUID.randomUUID());
    }
}

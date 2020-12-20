package com.classtechlab.manager.domain.model.keyword;

import java.util.UUID;

public class KeywordId {
    private UUID value;

    KeywordId() {
        this(UUID.randomUUID());
    }

    KeywordId(final UUID value) {
        this.value = value;
    }

    UUID value() {
        return this.value;
    }

    boolean isEqualTo(final KeywordId other) {
        return this.value.equals(other.value);
    }
}

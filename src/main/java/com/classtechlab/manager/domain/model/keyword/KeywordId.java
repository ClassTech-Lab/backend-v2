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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final KeywordId keywordId = (KeywordId) o;

        return value.equals(keywordId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

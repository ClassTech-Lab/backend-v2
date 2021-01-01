package com.classtechlab.manager.domain.model.keyword;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = KeywordIdSerializer.class)
public class KeywordId {
    private final UUID value;

    KeywordId() {
        this(UUID.randomUUID());
    }

    KeywordId(final UUID value) {
        this.value = value;
    }

    String string() {
        return this.value.toString();
    }

    boolean isEqualTo(final KeywordId other) {
        return this.value.equals(other.value);
    }

    public PlainObject toPlainObject() {
        return new PlainObject(this);
    }

    public static class PlainObject {
        private final String id;

        private PlainObject(final KeywordId keywordId) {
            this.id = keywordId.string();
        }
    }
}

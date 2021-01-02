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

    private UUID uuid() {
        return this.value;
    }

    boolean isEqualTo(final KeywordId other) {
        return this.value.equals(other.value);
    }

    static class PlainObject {
        private UUID id;

        static PlainObject parse(final KeywordId keywordId) {
            final PlainObject po = new PlainObject();
            po.id = keywordId.uuid();
            return po;
        }
    }
}

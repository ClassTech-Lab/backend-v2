package com.classtechlab.manager.domain.model.keyword;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = KeywordIdSerializer.class)
public class KeywordId {
    private final UUID value;

    KeywordId(final UUID value) {
        this.value = value;
    }

    KeywordId() {
        this(UUID.randomUUID());
    }

    UUID uuid() {
        return this.value;
    }

    boolean isEqualTo(final KeywordId other) {
        return this.value.equals(other.value);
    }

    static class POJO {
        private UUID id;

        static POJO parse(final KeywordId keywordId) {
            final POJO pojo = new POJO();
            pojo.id = keywordId.uuid();
            return pojo;
        }
    }
}

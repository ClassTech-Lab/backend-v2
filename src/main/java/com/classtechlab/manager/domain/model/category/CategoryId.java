package com.classtechlab.manager.domain.model.category;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = CategoryIdSerializer.class)
public class CategoryId {
    private final UUID value;

    CategoryId(final UUID value) {
        this.value = value;
    }

    CategoryId() {
        this(UUID.randomUUID());
    }

    UUID uuid() {
        return this.value;
    }

    boolean isEqualTo(final CategoryId other) {
        return this.value.equals(other.value);
    }

    static class POJO {
        private UUID id;

        static POJO parse(final CategoryId categoryId) {
            final POJO pojo = new POJO();
            pojo.id = categoryId.uuid();
            return pojo;
        }
    }
}

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

    static class PlainObject {
        private UUID id;

        static PlainObject parse(final CategoryId categoryId) {
            final PlainObject po = new PlainObject();
            po.id = categoryId.uuid();
            return po;
        }
    }
}

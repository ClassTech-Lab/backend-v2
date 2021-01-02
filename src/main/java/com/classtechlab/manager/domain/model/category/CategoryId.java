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

    String string() {
        return this.value.toString();
    }

    boolean isEqualTo(final CategoryId other) {
        return this.value.equals(other.value);
    }

    static class PlainObject {
        private String id;

        static PlainObject of(final CategoryId categoryId) {
            final PlainObject po = new PlainObject();
            po.id = categoryId.string();
            return po;
        }
    }
}

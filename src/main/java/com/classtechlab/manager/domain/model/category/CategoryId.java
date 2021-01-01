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

    public PlainObject toPlainObject() {
        return new PlainObject(this);
    }

    boolean isEqualTo(final CategoryId other) {
        return this.value.equals(other.value);
    }

    public static class PlainObject {
        private final String id;

        public PlainObject(final CategoryId categoryId) {
            this.id = categoryId.string();
        }
    }
}

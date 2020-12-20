package com.classtechlab.manager.domain.model.category;

import java.util.UUID;

public class CategoryId {
    private final UUID value;

    CategoryId(final UUID value) {
        this.value = value;
    }

    CategoryId() {
        this(UUID.randomUUID());
    }

    UUID value() {
        return this.value;
    }

    public PlainObject toPlainObject() {
        return new PlainObject(this);
    }

    boolean isEqualTo(final CategoryId other) {
        return this.value.equals(other.value);
    }

    public static class PlainObject {
        private final UUID id;

        public PlainObject(final CategoryId categoryId) {
            this.id = categoryId.value();
        }
    }
}

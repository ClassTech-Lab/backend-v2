package com.classtechlab.manager.domain.model.category;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;

import java.util.UUID;

public class Category implements Identifiable<Category> {
    CategoryId id;
    Name name;

    private Category() {
    }

    Category(final Name name) {
        this.id = new CategoryId();
        this.name = name;
    }

    public PlainObject toPlainObject() {
        return new PlainObject();
    }

    @Override
    public boolean isEqualTo(final Category other) {
        return this.id.isEqualTo(other.id);
    }

    public class PlainObject {
        private final UUID id = Category.this.id.value();
        private final String name = Category.this.name.value();

        private PlainObject() {
        }
    }
}

package com.classtechlab.manager.domain.model.category;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class Category implements Identifiable<Category> {
    private CategoryId id;
    private Name name;

    private Category() {
    }

    private Category(final Name name) {
        this.id = new CategoryId();
        this.name = name;
    }

    public CategoryId id() {
        return this.id;
    }

    public PlainObject toPlainObject() {
        return new PlainObject(this);
    }

    @Override
    public boolean isEqualTo(final Category other) {
        return this.id.isEqualTo(other.id);
    }

    public static class PlainObject {
        private UUID id;
        private String name;

        private PlainObject() {
        }

        private PlainObject(final Category category) {
            this.id = category.id.value();
            this.name = category.name.value();
        }

        public Category toCategory() {
            if (this.id == null || StringUtils.isBlank(this.name)) throw new IllegalArgumentException();
            final Category category = new Category(new Name(this.name));
            category.id = new CategoryId(this.id);
            return category;
        }

        public Category newCategory() {
            if (StringUtils.isBlank(this.name)) throw new IllegalArgumentException();
            return new Category(new Name(this.name));
        }
    }
}

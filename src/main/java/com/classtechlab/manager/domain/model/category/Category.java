package com.classtechlab.manager.domain.model.category;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = CategorySerializer.class)
@JsonDeserialize(using = CategoryDeserializer.class)
public class Category implements Identifiable<Category> {
    private CategoryId id;
    private Name name;

    private Category() {
    }

    private Category(final CategoryId id, final Name name) {
        this.id = id;
        this.name = name;
    }

    private Category(final Name name) {
        this(new CategoryId(), name);
    }

    public CategoryId id() {
        return this.id;
    }

    private Name name() {
        return this.name;
    }

    public Category copy(final CategoryId id) {
        return new Category(id, this.name());
    }

    public Category copy() {
        return this.copy(new CategoryId());
    }

    @Override
    public boolean isEqualTo(final Category other) {
        return this.id.isEqualTo(other.id);
    }

    static class PlainObject {
        private UUID id;
        private String name;

        static PlainObject parse(final Category category) {
            final PlainObject po = new PlainObject();
            po.id = category.id().uuid();
            po.name = category.name().string();
            return po;
        }

        Category construct() {
            final Name name = new Name(this.name);
            if (this.id == null) return new Category(name);
            return new Category(new CategoryId(id), name);
        }
    }
}

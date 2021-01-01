package com.classtechlab.manager.domain.model.category;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = CategorySerializer.class)
@JsonDeserialize(using = CategoryDeserializer.class)
public class Category implements Identifiable<Category> {
    private CategoryId id;
    private Name name;

    private Category() {
    }

    Category(final CategoryId id, final Name name) {
        this.id = id;
        this.name = name;
    }

    Category(final Name name) {
        this(new CategoryId(), name);
    }

    public CategoryId id() {
        return this.id;
    }

    Name name() {
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
}

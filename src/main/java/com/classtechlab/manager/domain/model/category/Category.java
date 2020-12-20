package com.classtechlab.manager.domain.model.category;

import com.classtechlab.manager.domain.type.name.Name;

public class Category {
    private final CategoryId id;
    private final Name name;

    public Category(final CategoryId id, final Name name) {
        this.id = id;
        this.name = name;
    }
}

package com.classtechlab.manager.domain.model.category;

public class Category {
    private final CategoryId id;
    private final CategoryName name;

    public Category(final CategoryId id, final CategoryName name) {
        this.id = id;
        this.name = name;
    }
}

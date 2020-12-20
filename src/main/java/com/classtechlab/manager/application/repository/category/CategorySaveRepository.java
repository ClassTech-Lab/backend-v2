package com.classtechlab.manager.application.repository.category;

import com.classtechlab.manager.domain.model.category.Category;

public interface CategorySaveRepository {
    void create(final Category category);

    void modify(final Category category);
}

package com.classtechlab.manager.application.repository.category;

import com.classtechlab.manager.domain.model.category.Category;
import com.classtechlab.manager.domain.model.category.CategoryId;
import com.classtechlab.manager.domain.type.item.Pack;

public interface CategoryReadRepository {
    Pack<Category> readAll();

    Category read(final CategoryId id);
}

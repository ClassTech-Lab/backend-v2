package com.classtechlab.manager.application.repository.category;

import com.classtechlab.manager.domain.model.category.Category;

public interface CategorySaveRepository {
    Category save(final Category category);
}

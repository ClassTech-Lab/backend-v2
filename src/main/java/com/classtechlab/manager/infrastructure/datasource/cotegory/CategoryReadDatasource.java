package com.classtechlab.manager.infrastructure.datasource.cotegory;

import com.classtechlab.manager.application.repository.category.CategoryReadRepository;
import com.classtechlab.manager.domain.model.category.Category;
import com.classtechlab.manager.domain.model.category.CategoryId;
import com.classtechlab.manager.domain.type.item.Pack;

public class CategoryReadDatasource implements CategoryReadRepository {
    private final CategoryMapper categoryMapper;

    public CategoryReadDatasource(final CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public Pack<Category> readAll() {
        return new Pack<>(this.categoryMapper.findAll());
    }

    @Override
    public Category readBy(final CategoryId id) {
        return this.categoryMapper.findBy(id);
    }
}

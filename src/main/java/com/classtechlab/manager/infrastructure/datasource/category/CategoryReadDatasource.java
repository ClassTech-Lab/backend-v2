package com.classtechlab.manager.infrastructure.datasource.category;

import com.classtechlab.manager.application.repository.category.CategoryReadRepository;
import com.classtechlab.manager.domain.model.category.Category;
import com.classtechlab.manager.domain.model.category.CategoryId;
import com.classtechlab.manager.domain.type.item.Pack;
import org.springframework.stereotype.Repository;

@Repository
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
    public Category read(final CategoryId id) {
        return this.categoryMapper.findBy(id);
    }
}

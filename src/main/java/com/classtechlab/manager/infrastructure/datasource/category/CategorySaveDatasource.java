package com.classtechlab.manager.infrastructure.datasource.category;

import com.classtechlab.manager.application.repository.category.CategorySaveRepository;
import com.classtechlab.manager.domain.model.category.Category;
import org.springframework.stereotype.Repository;

@Repository
public class CategorySaveDatasource implements CategorySaveRepository {
    private final CategoryMapper categoryMapper;

    public CategorySaveDatasource(final CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public void create(final Category category) {
        this.categoryMapper.insert(category);
    }

    @Override
    public boolean modify(final Category category) {
        return this.categoryMapper.update(category);
    }
}

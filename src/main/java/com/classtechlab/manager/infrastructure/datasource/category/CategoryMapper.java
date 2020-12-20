package com.classtechlab.manager.infrastructure.datasource.category;

import com.classtechlab.manager.domain.model.category.Category;
import com.classtechlab.manager.domain.model.category.CategoryId;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> findAll();

    Category findBy(final CategoryId id);
}

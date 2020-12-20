package com.classtechlab.manager.application.service.category;

import com.classtechlab.manager.application.repository.category.CategorySaveRepository;
import com.classtechlab.manager.domain.model.category.Category;
import com.classtechlab.manager.domain.model.category.CategoryId;
import org.springframework.stereotype.Service;

@Service
public class CategorySaveService {
    private final CategorySaveRepository categorySaveRepository;

    public CategorySaveService(final CategorySaveRepository categorySaveRepository) {
        this.categorySaveRepository = categorySaveRepository;
    }

    public CategoryId create(final Category category) {
        this.categorySaveRepository.create(category);
        return category.id();
    }

    public boolean modify(final Category category) {
        return this.categorySaveRepository.modify(category);
    }
}

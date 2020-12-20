package com.classtechlab.manager.application.service.category;

import com.classtechlab.manager.application.repository.category.CategorySaveRepository;
import com.classtechlab.manager.domain.model.category.Category;
import org.springframework.stereotype.Service;

@Service
public class CategorySaveService {
    private final CategorySaveRepository categorySaveRepository;

    public CategorySaveService(final CategorySaveRepository categorySaveRepository) {
        this.categorySaveRepository = categorySaveRepository;
    }

    public Category save(final Category category) {
        return this.categorySaveRepository.save(category);
    }
}

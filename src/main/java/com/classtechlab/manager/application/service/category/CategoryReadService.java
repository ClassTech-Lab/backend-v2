package com.classtechlab.manager.application.service.category;

import com.classtechlab.manager.application.repository.category.CategoryReadRepository;
import com.classtechlab.manager.domain.model.category.Category;
import com.classtechlab.manager.domain.model.category.CategoryId;
import com.classtechlab.manager.domain.type.item.Pack;
import org.springframework.stereotype.Service;

@Service
public class CategoryReadService {
    private final CategoryReadRepository categoryReadRepository;

    public CategoryReadService(final CategoryReadRepository categoryReadRepository) {
        this.categoryReadRepository = categoryReadRepository;
    }

    public Pack<Category> readAll() {
        return this.categoryReadRepository.readAll();
    }

    public Category readBy(final CategoryId id) {
        return this.categoryReadRepository.readBy(id);
    }
}

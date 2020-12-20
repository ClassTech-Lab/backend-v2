package com.classtechlab.manager.presentation.controller.category;

import com.classtechlab.manager.application.service.category.CategoryReadService;
import com.classtechlab.manager.domain.model.category.Category;
import com.classtechlab.manager.domain.model.category.CategoryId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    private final CategoryReadService categoryReadService;

    public CategoryController(final CategoryReadService categoryReadService) {
        this.categoryReadService = categoryReadService;
    }

    @GetMapping
    public List<Category.PlainObject> category() {
        return this.categoryReadService.readAll().values(Category::toPlainObject);
    }

    @GetMapping("{id}")
    public Category category(@PathVariable final CategoryId id) {
        return this.categoryReadService.readBy(id);
    }
}

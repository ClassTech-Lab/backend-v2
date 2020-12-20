package com.classtechlab.manager.presentation.controller.category;

import com.classtechlab.manager.application.service.category.CategoryReadService;
import com.classtechlab.manager.application.service.category.CategorySaveService;
import com.classtechlab.manager.domain.model.category.Category;
import com.classtechlab.manager.domain.model.category.CategoryId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    private final CategoryReadService categoryReadService;
    private final CategorySaveService categorySaveService;

    public CategoryController(final CategoryReadService categoryReadService, final CategorySaveService categorySaveService) {
        this.categoryReadService = categoryReadService;
        this.categorySaveService = categorySaveService;
    }

    @GetMapping
    public List<Category.PlainObject> get() {
        return this.categoryReadService.readAll().values(Category::toPlainObject);
    }

    @GetMapping("{id}")
    public Category get(@PathVariable final CategoryId id) {
        return this.categoryReadService.readBy(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put(@RequestBody final Category.PlainObject categoryPlainObject) {
        this.categorySaveService.save(categoryPlainObject.toCategory());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryId.PlainObject post(@RequestBody final Category.PlainObject categoryPlainObject) {
        return this.categorySaveService.save(categoryPlainObject.newCategory()).id().toPlainObject();
    }
}

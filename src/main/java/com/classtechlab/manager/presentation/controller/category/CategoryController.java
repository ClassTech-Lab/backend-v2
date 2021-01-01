package com.classtechlab.manager.presentation.controller.category;

import com.classtechlab.manager.application.service.category.CategoryReadService;
import com.classtechlab.manager.application.service.category.CategorySaveService;
import com.classtechlab.manager.domain.exception.IllegalArgumentException;
import com.classtechlab.manager.domain.model.category.Category;
import com.classtechlab.manager.domain.model.category.CategoryId;
import com.classtechlab.manager.domain.type.item.Pack;
import com.classtechlab.manager.presentation.controller.exception.BadRequestException;
import com.classtechlab.manager.presentation.controller.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public Pack<Category> get() {
        return this.categoryReadService.readAll();
    }

    @GetMapping("{id}")
    public Category get(@PathVariable final CategoryId id) {
        return this.categoryReadService.readBy(id);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put(@PathVariable final CategoryId id, @RequestBody final Category.PlainObject categoryPlainObject) {
        try {
            if (!this.categorySaveService.modify(categoryPlainObject.toCategory(id))) throw new NotFoundException();
        } catch (IllegalArgumentException e) {
            throw new BadRequestException(e);
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryId post(@RequestBody final Category.PlainObject categoryPlainObject) {
        try {
            return this.categorySaveService.create(categoryPlainObject.toCategory());
        } catch (IllegalArgumentException e) {
            throw new BadRequestException(e);
        }
    }
}

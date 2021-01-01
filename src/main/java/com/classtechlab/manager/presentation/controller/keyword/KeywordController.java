package com.classtechlab.manager.presentation.controller.keyword;

import com.classtechlab.manager.application.service.keyword.KeywordReadService;
import com.classtechlab.manager.application.service.keyword.KeywordSaveService;
import com.classtechlab.manager.domain.model.keyword.Keyword;
import com.classtechlab.manager.domain.model.keyword.KeywordId;
import com.classtechlab.manager.domain.type.item.Pack;
import com.classtechlab.manager.presentation.controller.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("keyword")
public class KeywordController {
    private final KeywordReadService keywordReadService;
    private final KeywordSaveService keywordSaveService;

    public KeywordController(final KeywordReadService keywordReadService, final KeywordSaveService keywordSaveService) {
        this.keywordReadService = keywordReadService;
        this.keywordSaveService = keywordSaveService;
    }

    @GetMapping
    public Pack<Keyword> get() {
        return this.keywordReadService.readAll();
    }

    @GetMapping("{id}")
    public Keyword get(@PathVariable final KeywordId id) {
        return this.keywordReadService.readBy(id);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put(@PathVariable final KeywordId id, @RequestBody final Keyword keyword) {
        if (!this.keywordSaveService.modify(keyword.copy(id))) throw new NotFoundException();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public KeywordId post(@RequestBody final Keyword keyword) {
        return this.keywordSaveService.create(keyword.copy());
    }
}

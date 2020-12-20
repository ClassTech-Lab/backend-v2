package com.classtechlab.manager.presentation.controller.keyword;

import com.classtechlab.manager.application.service.keyword.KeywordReadService;
import com.classtechlab.manager.application.service.keyword.KeywordSaveService;
import com.classtechlab.manager.domain.exception.IllegalArgumentException;
import com.classtechlab.manager.domain.model.keyword.Keyword;
import com.classtechlab.manager.domain.model.keyword.KeywordId;
import com.classtechlab.manager.presentation.controller.exception.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Keyword.PlainObject> get() {
        return this.keywordReadService.readAll().values(Keyword::toPlainObject);
    }

    @GetMapping("{id}")
    public Keyword.PlainObject get(@PathVariable final KeywordId id) {
        return this.keywordReadService.readBy(id).toPlainObject();
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put(@PathVariable final KeywordId id, @RequestBody final Keyword.PlainObject keywordPlainObject) {
        try {
            this.keywordSaveService.modify(keywordPlainObject.toKeyword(id));
        } catch (IllegalArgumentException e) {
            throw new BadRequestException(e);
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public KeywordId.PlainObject post(@RequestBody final Keyword.PlainObject keywordPlainObject) {
        try {
            return this.keywordSaveService.create(keywordPlainObject.toKeyword()).toPlainObject();
        } catch (IllegalArgumentException e) {
            throw new BadRequestException(e);
        }
    }
}

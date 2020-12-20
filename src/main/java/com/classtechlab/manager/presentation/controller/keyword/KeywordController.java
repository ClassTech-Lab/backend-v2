package com.classtechlab.manager.presentation.controller.keyword;

import com.classtechlab.manager.application.service.keyword.KeywordReadService;
import com.classtechlab.manager.application.service.keyword.KeywordSaveService;
import com.classtechlab.manager.domain.model.keyword.Keyword;
import com.classtechlab.manager.domain.model.keyword.KeywordId;
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

    @PutMapping
    public void put(@RequestBody final Keyword.PlainObject keywordPlainObject) {
        this.keywordSaveService.save(keywordPlainObject.toKeyword()).id().toPlainObject();
    }

    @PostMapping
    public KeywordId.PlainObject post(@RequestBody final Keyword.PlainObject keywordPlainObject) {
        return this.keywordSaveService.save(keywordPlainObject.newKeyword()).id().toPlainObject();
    }
}

package com.classtechlab.manager.presentation.controller.keyword;

import com.classtechlab.manager.application.service.keyword.KeywordReadService;
import com.classtechlab.manager.domain.model.keyword.Keyword;
import com.classtechlab.manager.domain.model.keyword.KeywordId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("keyword")
public class KeywordController {
    private final KeywordReadService keywordReadService;

    public KeywordController(final KeywordReadService keywordReadService) {
        this.keywordReadService = keywordReadService;
    }

    @GetMapping
    public List<Keyword.PlainObject> keyword() {
        return this.keywordReadService.readAll().values(Keyword::toPlainObject);
    }

    @GetMapping("{id}")
    public Keyword keyword(@PathVariable final KeywordId id) {
        return this.keywordReadService.readBy(id);
    }
}

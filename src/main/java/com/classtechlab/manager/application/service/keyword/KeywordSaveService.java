package com.classtechlab.manager.application.service.keyword;

import com.classtechlab.manager.application.repository.keyword.KeywordSaveRepository;
import com.classtechlab.manager.domain.model.keyword.Keyword;
import com.classtechlab.manager.domain.model.keyword.KeywordId;
import org.springframework.stereotype.Service;

@Service
public class KeywordSaveService {
    private final KeywordSaveRepository keywordSaveRepository;

    public KeywordSaveService(final KeywordSaveRepository keywordSaveRepository) {
        this.keywordSaveRepository = keywordSaveRepository;
    }

    public KeywordId create(final Keyword keyword) {
        this.keywordSaveRepository.create(keyword);
        return keyword.id();
    }

    public boolean modify(final Keyword keyword) {
        return this.keywordSaveRepository.modify(keyword);
    }
}

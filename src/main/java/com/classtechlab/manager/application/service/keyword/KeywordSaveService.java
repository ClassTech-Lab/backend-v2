package com.classtechlab.manager.application.service.keyword;

import com.classtechlab.manager.application.repository.keyword.KeywordSaveRepository;
import com.classtechlab.manager.domain.model.keyword.Keyword;
import org.springframework.stereotype.Service;

@Service
public class KeywordSaveService {
    private final KeywordSaveRepository keywordSaveRepository;

    public KeywordSaveService(final KeywordSaveRepository keywordSaveRepository) {
        this.keywordSaveRepository = keywordSaveRepository;
    }

    public Keyword save(final Keyword keyword) {
        return this.keywordSaveRepository.save(keyword);
    }
}

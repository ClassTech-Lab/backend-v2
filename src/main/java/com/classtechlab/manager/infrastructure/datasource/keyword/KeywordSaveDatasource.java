package com.classtechlab.manager.infrastructure.datasource.keyword;

import com.classtechlab.manager.application.repository.keyword.KeywordSaveRepository;
import com.classtechlab.manager.domain.model.keyword.Keyword;
import org.springframework.stereotype.Repository;

@Repository
public class KeywordSaveDatasource implements KeywordSaveRepository {
    private final KeywordMapper keywordMapper;

    public KeywordSaveDatasource(final KeywordMapper keywordMapper) {
        this.keywordMapper = keywordMapper;
    }

    @Override
    public Keyword save(final Keyword keyword) {
        this.keywordMapper.save(keyword);
        return keyword;
    }
}

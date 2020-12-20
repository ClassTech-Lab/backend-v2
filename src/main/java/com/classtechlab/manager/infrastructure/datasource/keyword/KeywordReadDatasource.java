package com.classtechlab.manager.infrastructure.datasource.keyword;

import com.classtechlab.manager.application.repository.keyword.KeywordReadRepository;
import com.classtechlab.manager.domain.model.keyword.Keyword;
import com.classtechlab.manager.domain.model.keyword.KeywordId;
import com.classtechlab.manager.domain.type.item.Pack;
import org.springframework.stereotype.Repository;

@Repository
public class KeywordReadDatasource implements KeywordReadRepository {
    private final KeywordMapper keywordMapper;

    public KeywordReadDatasource(final KeywordMapper keywordMapper) {
        this.keywordMapper = keywordMapper;
    }

    @Override
    public Pack<Keyword> readAll() {
        return new Pack<>(this.keywordMapper.findAll());
    }

    @Override
    public Keyword read(final KeywordId id) {
        return this.keywordMapper.findBy(id);
    }
}

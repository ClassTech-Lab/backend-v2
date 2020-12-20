package com.classtechlab.manager.infrastructure.datasource.keyword;

import com.classtechlab.manager.domain.model.keyword.Keyword;
import com.classtechlab.manager.domain.model.keyword.KeywordId;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KeywordMapper {
    void insert(final Keyword keyword);

    List<Keyword> findAll();

    Keyword findBy(final KeywordId id);

    boolean update(final Keyword keyword);

    boolean delete(final Keyword keyword);
}

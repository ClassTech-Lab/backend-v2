package com.classtechlab.manager.application.repository.keyword;

import com.classtechlab.manager.domain.model.keyword.Keyword;
import com.classtechlab.manager.domain.model.keyword.KeywordId;
import com.classtechlab.manager.domain.type.item.Pack;

public interface KeywordReadRepository {
    Pack<Keyword> readAll();

    Keyword read(final KeywordId id);
}

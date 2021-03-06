package com.classtechlab.manager.application.repository.keyword;

import com.classtechlab.manager.domain.model.keyword.Keyword;

public interface KeywordSaveRepository {
    void create(final Keyword keyword);

    boolean modify(final Keyword keyword);
}

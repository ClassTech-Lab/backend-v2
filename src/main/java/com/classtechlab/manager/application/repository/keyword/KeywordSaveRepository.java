package com.classtechlab.manager.application.repository.keyword;

import com.classtechlab.manager.domain.model.keyword.Keyword;

public interface KeywordSaveRepository {
    Keyword save(final Keyword keyword);
}

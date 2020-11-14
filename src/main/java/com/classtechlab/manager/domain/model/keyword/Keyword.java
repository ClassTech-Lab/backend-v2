package com.classtechlab.manager.domain.model.keyword;

public class Keyword {
    private final KeywordId id;
    private final KeywordName name;

    public Keyword(final KeywordId id, final KeywordName name) {
        this.id = id;
        this.name = name;
    }
}

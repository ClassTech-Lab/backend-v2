package com.classtechlab.manager.domain.model.keyword;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class StringToKeywordIdConverter implements Converter<String, KeywordId> {
    @Override
    public KeywordId convert(@NonNull final String source) {
        return new KeywordId(UUID.fromString(source));
    }
}

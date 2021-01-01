package com.classtechlab.manager.domain.model.category;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class StringToCategoryIdConverter implements Converter<String, CategoryId> {
    @Override
    public CategoryId convert(@NonNull final String source) {
        return new CategoryId(UUID.fromString(source));
    }
}

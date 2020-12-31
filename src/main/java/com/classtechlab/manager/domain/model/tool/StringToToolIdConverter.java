package com.classtechlab.manager.domain.model.tool;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class StringToToolIdConverter implements Converter<String, ToolId> {
    @Override
    public ToolId convert(@NonNull final String source) {
        return new ToolId(UUID.fromString(source));
    }
}

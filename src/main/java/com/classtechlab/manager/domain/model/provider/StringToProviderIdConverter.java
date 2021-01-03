package com.classtechlab.manager.domain.model.provider;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class StringToProviderIdConverter implements Converter<String, ProviderId> {
    @Override
    public ProviderId convert(@NonNull String source) {
        return new ProviderId(UUID.fromString(source));
    }
}

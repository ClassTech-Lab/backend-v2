package com.classtechlab.manager._configuration.converter.keyword;

import com.classtechlab.manager.domain.model.keyword.KeywordId;
import com.classtechlab.manager.exception.ClassTechLabManagerRuntimeException;
import org.springframework.core.convert.converter.Converter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class StringToKeywordIdConverter implements Converter<String, KeywordId> {
    @Override
    public KeywordId convert(final String source) {
        try {
            final Constructor<KeywordId> keywordIdConstructor = KeywordId.class.getDeclaredConstructor();
            keywordIdConstructor.setAccessible(true);
            final KeywordId keywordId = keywordIdConstructor.newInstance();
            final Field field = KeywordId.class.getDeclaredField("value");
            field.setAccessible(true);
            field.set(keywordId, UUID.fromString(source));
            return keywordId;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            throw new ClassTechLabManagerRuntimeException();
        }
    }
}

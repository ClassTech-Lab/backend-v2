package com.classtechlab.manager._configuration.converter.category;

import com.classtechlab.manager.domain.model.category.CategoryId;
import com.classtechlab.manager.exception.ClassTechLabManagerRuntimeException;
import org.springframework.core.convert.converter.Converter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class StringToCategoryIdConverter implements Converter<String, CategoryId> {
    @Override
    public CategoryId convert(final String source) {
        try {
            final Constructor<CategoryId> categoryIdConstructor = CategoryId.class.getDeclaredConstructor();
            categoryIdConstructor.setAccessible(true);
            final CategoryId categoryId = categoryIdConstructor.newInstance();
            final Field field = CategoryId.class.getDeclaredField("value");
            field.setAccessible(true);
            field.set(categoryId, UUID.fromString(source));
            return categoryId;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            throw new ClassTechLabManagerRuntimeException();
        }
    }
}

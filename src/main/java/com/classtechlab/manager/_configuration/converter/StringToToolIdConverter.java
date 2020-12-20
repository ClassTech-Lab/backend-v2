package com.classtechlab.manager._configuration.converter;

import com.classtechlab.manager.domain.model.tool.ToolId;
import com.classtechlab.manager.exception.ApplicationRuntimeException;
import org.springframework.core.convert.converter.Converter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class StringToToolIdConverter implements Converter<String, ToolId> {
    @Override
    public ToolId convert(final String source) {
        try {
            final Constructor<ToolId> toolIdConstructor = ToolId.class.getDeclaredConstructor();
            toolIdConstructor.setAccessible(true);
            final ToolId toolId = toolIdConstructor.newInstance();
            final Field field = ToolId.class.getDeclaredField("value");
            field.setAccessible(true);
            field.set(toolId, UUID.fromString(source));
            return toolId;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            throw new ApplicationRuntimeException();
        }
    }
}

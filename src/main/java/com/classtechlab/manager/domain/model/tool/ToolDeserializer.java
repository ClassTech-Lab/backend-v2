package com.classtechlab.manager.domain.model.tool;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

class ToolDeserializer extends StdDeserializer<Tool> {
    private ToolDeserializer() {
        this((Class<?>) null);
    }

    protected ToolDeserializer(final Class<?> vc) {
        super(vc);
    }

    protected ToolDeserializer(final JavaType valueType) {
        super(valueType);
    }

    protected ToolDeserializer(final StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Tool deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return p.readValueAs(Tool.POJO.class).construct();
    }
}

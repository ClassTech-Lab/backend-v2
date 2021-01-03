package com.classtechlab.manager.domain.model.category;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

class CategoryDeserializer extends StdDeserializer<Category> {
    private CategoryDeserializer() {
        this((Class<?>) null);
    }

    protected CategoryDeserializer(final Class<?> vc) {
        super(vc);
    }

    protected CategoryDeserializer(final JavaType valueType) {
        super(valueType);
    }

    protected CategoryDeserializer(final StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Category deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return p.readValueAs(Category.POJO.class).construct();
    }
}

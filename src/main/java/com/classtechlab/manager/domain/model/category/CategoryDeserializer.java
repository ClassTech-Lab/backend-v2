package com.classtechlab.manager.domain.model.category;

import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.UUID;

class CategoryDeserializer extends StdDeserializer<Category> {
    private CategoryDeserializer() {
        this((Class<?>) null);
    }

    protected CategoryDeserializer(Class<?> vc) {
        super(vc);
    }

    protected CategoryDeserializer(JavaType valueType) {
        super(valueType);
    }

    protected CategoryDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Category deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        final JsonNode node = p.getCodec().readTree(p);
        final Name name = new Name(node.get("name").textValue());
        final CategoryId id;
        if (node.hasNonNull("id")) {
            return new Category(new CategoryId(UUID.fromString(node.get("id").textValue())), name);
        }
        return new Category(name);
    }
}

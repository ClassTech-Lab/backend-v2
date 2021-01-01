package com.classtechlab.manager.domain.model.tool;

import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.UUID;

class ToolDeserializer extends StdDeserializer<Tool> {
    private ToolDeserializer() {
        this((Class<?>) null);
    }

    protected ToolDeserializer(Class<?> vc) {
        super(vc);
    }

    protected ToolDeserializer(JavaType valueType) {
        super(valueType);
    }

    protected ToolDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Tool deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        final JsonNode node = p.getCodec().readTree(p);
        final Name name = new Name(node.get("name").textValue());
        if (node.hasNonNull("id")) {
            return new Tool(new ToolId(UUID.fromString(node.get("id").textValue())), name);
        }
        return new Tool(name);
    }
}

package com.classtechlab.manager.domain.model.keyword;

import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.UUID;

class KeywordDeserializer extends StdDeserializer<Keyword> {
    private KeywordDeserializer() {
        this((Class<?>) null);
    }

    protected KeywordDeserializer(Class<?> vc) {
        super(vc);
    }

    protected KeywordDeserializer(JavaType valueType) {
        super(valueType);
    }

    protected KeywordDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Keyword deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        final JsonNode node = p.getCodec().readTree(p);
        final Name name = new Name(node.get("name").textValue());
        if (node.hasNonNull("id")) {
            return new Keyword(new KeywordId(UUID.fromString(node.get("id").textValue())), name);
        }
        return new Keyword(name);
    }
}

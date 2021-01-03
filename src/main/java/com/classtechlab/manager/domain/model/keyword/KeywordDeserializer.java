package com.classtechlab.manager.domain.model.keyword;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

class KeywordDeserializer extends StdDeserializer<Keyword> {
    private KeywordDeserializer() {
        this((Class<?>) null);
    }

    protected KeywordDeserializer(final Class<?> vc) {
        super(vc);
    }

    protected KeywordDeserializer(final JavaType valueType) {
        super(valueType);
    }

    protected KeywordDeserializer(final StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Keyword deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return p.readValueAs(Keyword.POJO.class).construct();
    }
}

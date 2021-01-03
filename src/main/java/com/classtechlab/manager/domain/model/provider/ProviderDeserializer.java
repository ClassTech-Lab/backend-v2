package com.classtechlab.manager.domain.model.provider;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

class ProviderDeserializer extends StdDeserializer<Provider> {
    private ProviderDeserializer() {
        this((Class<?>) null);
    }

    protected ProviderDeserializer(final Class<?> vc) {
        super(vc);
    }

    protected ProviderDeserializer(final JavaType valueType) {
        super(valueType);
    }

    protected ProviderDeserializer(final StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Provider deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return p.readValueAs(Provider.POJO.class).construct();
    }
}

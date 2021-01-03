package com.classtechlab.manager.domain.model.provider;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class ProviderSerializer extends StdSerializer<Provider> {
    private ProviderSerializer() {
        this((Class<Provider>) null);
    }

    protected ProviderSerializer(final Class<Provider> t) {
        super(t);
    }

    protected ProviderSerializer(final JavaType type) {
        super(type);
    }

    protected ProviderSerializer(final Class<?> t, final boolean dummy) {
        super(t, dummy);
    }

    protected ProviderSerializer(final StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final Provider value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(Provider.POJO.parse(value));
    }
}

package com.classtechlab.manager.domain.model.provider;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class ProviderIdSerializer extends StdSerializer<ProviderId> {
    private ProviderIdSerializer() {
        this((Class<ProviderId>) null);
    }

    protected ProviderIdSerializer(final Class<ProviderId> t) {
        super(t);
    }

    protected ProviderIdSerializer(final JavaType type) {
        super(type);
    }

    protected ProviderIdSerializer(final Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected ProviderIdSerializer(final StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final ProviderId value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(ProviderId.POJO.parse(value));
    }
}

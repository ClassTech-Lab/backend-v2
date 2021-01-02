package com.classtechlab.manager.domain.model.keyword;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class KeywordIdSerializer extends StdSerializer<KeywordId> {
    private KeywordIdSerializer() {
        this((Class<KeywordId>) null);
    }

    protected KeywordIdSerializer(Class<KeywordId> t) {
        super(t);
    }

    protected KeywordIdSerializer(JavaType type) {
        super(type);
    }

    protected KeywordIdSerializer(Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected KeywordIdSerializer(StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final KeywordId value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(KeywordId.PlainObject.parse(value));
    }
}

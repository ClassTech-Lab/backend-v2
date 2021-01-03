package com.classtechlab.manager.domain.model.keyword;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class KeywordSerializer extends StdSerializer<Keyword> {
    private KeywordSerializer() {
        this((Class<Keyword>) null);
    }

    protected KeywordSerializer(Class<Keyword> t) {
        super(t);
    }

    protected KeywordSerializer(JavaType type) {
        super(type);
    }

    protected KeywordSerializer(Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected KeywordSerializer(StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final Keyword value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(Keyword.POJO.parse(value));
    }
}

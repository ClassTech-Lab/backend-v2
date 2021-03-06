package com.classtechlab.manager.domain.model.category;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class CategoryIdSerializer extends StdSerializer<CategoryId> {
    private CategoryIdSerializer() {
        this((Class<CategoryId>) null);
    }

    protected CategoryIdSerializer(final Class<CategoryId> t) {
        super(t);
    }

    protected CategoryIdSerializer(final JavaType type) {
        super(type);
    }

    protected CategoryIdSerializer(final Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected CategoryIdSerializer(final StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final CategoryId value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(CategoryId.POJO.parse(value));
    }
}

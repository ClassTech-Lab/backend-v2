package com.classtechlab.manager.domain.model.category;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class CategorySerializer extends StdSerializer<Category> {
    private CategorySerializer() {
        this((Class<Category>) null);
    }

    protected CategorySerializer(Class<Category> t) {
        super(t);
    }

    protected CategorySerializer(JavaType type) {
        super(type);
    }

    protected CategorySerializer(Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected CategorySerializer(StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final Category value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(Category.PlainObject.of(value));
    }
}

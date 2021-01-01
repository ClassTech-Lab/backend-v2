package com.classtechlab.manager.domain.type.item;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class PackSerializer<T extends Identifiable<T>> extends StdSerializer<Pack<T>> {
    private PackSerializer() {
        this((Class<Pack<T>>) null);
    }

    protected PackSerializer(Class<Pack<T>> t) {
        super(t);
    }

    protected PackSerializer(JavaType type) {
        super(type);
    }

    protected PackSerializer(Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected PackSerializer(StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final Pack<T> value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(value.toList());
    }
}

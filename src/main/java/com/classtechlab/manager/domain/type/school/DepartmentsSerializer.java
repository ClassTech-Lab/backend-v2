package com.classtechlab.manager.domain.type.school;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class DepartmentsSerializer extends StdSerializer<Departments> {
    private DepartmentsSerializer() {
        this((Class<Departments>) null);
    }

    protected DepartmentsSerializer(final Class<Departments> t) {
        super(t);
    }

    protected DepartmentsSerializer(final JavaType type) {
        super(type);
    }

    protected DepartmentsSerializer(final Class<?> t, final boolean dummy) {
        super(t, dummy);
    }

    protected DepartmentsSerializer(final StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final Departments value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(value.strings());
    }
}

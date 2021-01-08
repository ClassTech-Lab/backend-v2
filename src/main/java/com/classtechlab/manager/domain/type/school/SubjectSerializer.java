package com.classtechlab.manager.domain.type.school;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class SubjectSerializer extends StdSerializer<Subject> {
    private SubjectSerializer() {
        this((Class<Subject>) null);
    }

    protected SubjectSerializer(final Class<Subject> t) {
        super(t);
    }

    protected SubjectSerializer(final JavaType type) {
        super(type);
    }

    protected SubjectSerializer(final Class<?> t, final boolean dummy) {
        super(t, dummy);
    }

    protected SubjectSerializer(final StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final Subject value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(Subject.POJO.parse(value));
    }
}

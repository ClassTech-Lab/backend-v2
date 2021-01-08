package com.classtechlab.manager.domain.type.school;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class DepartmentSerializer extends StdSerializer<Department> {
    private DepartmentSerializer() {
        this((Class<Department>) null);
    }

    protected DepartmentSerializer(final Class<Department> t) {
        super(t);
    }

    protected DepartmentSerializer(final JavaType type) {
        super(type);
    }

    protected DepartmentSerializer(final Class<?> t, final boolean dummy) {
        super(t, dummy);
    }

    protected DepartmentSerializer(final StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final Department value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(Department.POJO.parse(value));
    }
}

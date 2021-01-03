package com.classtechlab.manager.domain.model.tool;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class ToolSerializer extends StdSerializer<Tool> {
    protected ToolSerializer() {
        this((Class<Tool>) null);
    }

    protected ToolSerializer(Class<Tool> t) {
        super(t);
    }

    protected ToolSerializer(JavaType type) {
        super(type);
    }

    protected ToolSerializer(Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected ToolSerializer(StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final Tool value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(Tool.POJO.parse(value));
    }
}

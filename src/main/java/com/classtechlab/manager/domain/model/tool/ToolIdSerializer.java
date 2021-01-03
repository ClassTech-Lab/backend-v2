package com.classtechlab.manager.domain.model.tool;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class ToolIdSerializer extends StdSerializer<ToolId> {
    protected ToolIdSerializer() {
        this((Class<ToolId>) null);
    }

    protected ToolIdSerializer(final Class<ToolId> t) {
        super(t);
    }

    protected ToolIdSerializer(final JavaType type) {
        super(type);
    }

    protected ToolIdSerializer(final Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected ToolIdSerializer(final StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final ToolId value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(ToolId.POJO.parse(value));
    }
}

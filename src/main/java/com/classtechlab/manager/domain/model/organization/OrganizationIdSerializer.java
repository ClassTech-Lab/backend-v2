package com.classtechlab.manager.domain.model.organization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

class OrganizationIdSerializer extends StdSerializer<OrganizationId> {
    private OrganizationIdSerializer() {
        this((Class<OrganizationId>) null);
    }

    protected OrganizationIdSerializer(final Class<OrganizationId> t) {
        super(t);
    }

    protected OrganizationIdSerializer(final JavaType type) {
        super(type);
    }

    protected OrganizationIdSerializer(final Class<?> t, final boolean dummy) {
        super(t, dummy);
    }

    protected OrganizationIdSerializer(final StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(final OrganizationId value, final JsonGenerator gen, final SerializerProvider provider) throws IOException {
        gen.writeObject(OrganizationId.POJO.parse(value));
    }
}

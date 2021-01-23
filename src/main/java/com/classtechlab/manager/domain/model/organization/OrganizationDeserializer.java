package com.classtechlab.manager.domain.model.organization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

class OrganizationDeserializer extends StdDeserializer<Organization> {
    private OrganizationDeserializer() {
        this((Class<?>) null);
    }

    protected OrganizationDeserializer(final Class<?> vc) {
        super(vc);
    }

    protected OrganizationDeserializer(final JavaType valueType) {
        super(valueType);
    }

    protected OrganizationDeserializer(final StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Organization deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return p.readValueAs(Organization.POJO.class).construct();
    }
}

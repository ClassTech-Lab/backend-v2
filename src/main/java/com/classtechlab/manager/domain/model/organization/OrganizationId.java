package com.classtechlab.manager.domain.model.organization;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = OrganizationIdSerializer.class)
public class OrganizationId {
    private final UUID value;

    OrganizationId(final UUID value) {
        this.value = value;
    }

    OrganizationId() {
        this(UUID.randomUUID());
    }

    UUID uuid() {
        return this.value;
    }

    boolean isEquals(final OrganizationId other) {
        return this.value.equals(other.value);
    }

    static class POJO {
        private UUID id;

        static POJO parse(final OrganizationId organizationId) {
            final POJO pojo = new POJO();
            pojo.id = organizationId.uuid();
            return pojo;
        }
    }
}

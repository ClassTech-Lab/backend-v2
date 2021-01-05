package com.classtechlab.manager.domain.model.organization;

import java.util.UUID;

public class OrganizationId {
    private final UUID value;

    private OrganizationId(final UUID value) {
        this.value = value;
    }

    OrganizationId() {
        this(UUID.randomUUID());
    }

    boolean isEquals(final OrganizationId other) {
        return this.value.equals(other.value);
    }
}

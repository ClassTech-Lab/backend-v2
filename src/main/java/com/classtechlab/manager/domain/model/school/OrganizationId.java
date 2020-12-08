package com.classtechlab.manager.domain.model.school;

import java.util.UUID;

public class OrganizationId {
    private final UUID value;

    private OrganizationId(final UUID value) {
        this.value = value;
    }

    OrganizationId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final OrganizationId organizationId = (OrganizationId) o;

        return value.equals(organizationId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

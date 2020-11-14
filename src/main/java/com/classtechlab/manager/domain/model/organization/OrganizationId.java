package com.classtechlab.manager.domain.model.organization;

import java.util.UUID;

public class OrganizationId {
    private final UUID value;

    public OrganizationId(final UUID value) {
        this.value = value;
    }
    public OrganizationId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final OrganizationId that = (OrganizationId) o;

        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

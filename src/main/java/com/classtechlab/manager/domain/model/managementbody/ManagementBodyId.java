package com.classtechlab.manager.domain.model.managementbody;

import java.util.UUID;

public class ManagementBodyId {
    private final UUID value;

    public ManagementBodyId(final UUID value) {
        this.value = value;
    }

    public ManagementBodyId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final ManagementBodyId that = (ManagementBodyId) o;

        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

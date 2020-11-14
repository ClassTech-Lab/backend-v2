package com.classtechlab.manager.domain.model.provider;

import java.util.UUID;

public class ProviderId {
    private final UUID value;

    public ProviderId(final UUID value) {
        this.value = value;
    }

    public ProviderId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final ProviderId that = (ProviderId) o;

        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

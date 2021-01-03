package com.classtechlab.manager.domain.model.provider;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = ProviderIdSerializer.class)
public class ProviderId {
    private final UUID value;

    ProviderId(final UUID value) {
        this.value = value;
    }

    ProviderId() {
        this(UUID.randomUUID());
    }

    UUID uuid() {
        return this.value;
    }

    boolean isEquals(final ProviderId other) {
        return this.value.equals(other.value);
    }

    static class POJO {
        private UUID id;

        static POJO parse(final ProviderId providerId) {
            final POJO pojo = new POJO();
            pojo.id = providerId.uuid();
            return pojo;
        }
    }
}

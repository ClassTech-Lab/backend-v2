package com.classtechlab.manager.domain.model.provider;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = ProviderSerializer.class)
@JsonDeserialize(using = ProviderDeserializer.class)
public class Provider implements Identifiable<Provider> {
    private final ProviderId id;
    private final Name name;

    private Provider(final ProviderId id, final Name name) {
        this.id = id;
        this.name = name;
    }

    private Provider(final Name name) {
        this(new ProviderId(), name);
    }

    public ProviderId id() {
        return this.id;
    }

    private Name name() {
        return this.name;
    }

    @Override
    public boolean isEqualTo(final Provider other) {
        return this.id().isEquals(other.id());
    }

    static class POJO {
        private UUID id;
        private String name;

        static POJO parse(final Provider provider) {
            final POJO pojo = new POJO();
            pojo.id = provider.id().uuid();
            pojo.name = provider.name().string();
            return pojo;
        }

        Provider construct() {
            final Name name = new Name(this.name);
            if (this.id == null) return new Provider(name);
            return new Provider(new ProviderId(this.id), name);
        }
    }
}

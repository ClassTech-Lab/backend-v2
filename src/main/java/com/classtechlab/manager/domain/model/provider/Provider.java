package com.classtechlab.manager.domain.model.provider;

public class Provider {
    private final ProviderId id;
    private final ProviderName name;

    public Provider(final ProviderId id, final ProviderName name) {
        this.id = id;
        this.name = name;
    }
}

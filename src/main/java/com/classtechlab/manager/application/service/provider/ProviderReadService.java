package com.classtechlab.manager.application.service.provider;

import com.classtechlab.manager.application.repository.provider.ProviderReadRepository;
import com.classtechlab.manager.domain.model.provider.Provider;
import com.classtechlab.manager.domain.model.provider.ProviderId;
import com.classtechlab.manager.domain.type.item.Pack;

public class ProviderReadService {
    private final ProviderReadRepository providerReadRepository;

    public ProviderReadService(final ProviderReadRepository providerReadRepository) {
        this.providerReadRepository = providerReadRepository;
    }

    public Pack<Provider> readAll() {
        return this.providerReadRepository.readAll();
    }

    public Provider read(final ProviderId id) {
        return this.providerReadRepository.read(id);
    }
}

package com.classtechlab.manager.application.service.provider;

import com.classtechlab.manager.application.repository.provider.ProviderSaveRepository;
import com.classtechlab.manager.domain.model.provider.Provider;
import com.classtechlab.manager.domain.model.provider.ProviderId;

public class ProviderSaveService {
    private final ProviderSaveRepository providerSaveRepository;

    public ProviderSaveService(final ProviderSaveRepository providerSaveRepository) {
        this.providerSaveRepository = providerSaveRepository;
    }

    public ProviderId create(final Provider provider) {
        this.providerSaveRepository.create(provider);
        return provider.id();
    }

    public boolean modify(final Provider provider) {
        return this.providerSaveRepository.modify(provider);
    }
}

package com.classtechlab.manager.application.repository.provider;

import com.classtechlab.manager.domain.model.provider.Provider;

public interface ProviderSaveRepository {
    void create(final Provider provider);

    boolean modify(final Provider provider);
}

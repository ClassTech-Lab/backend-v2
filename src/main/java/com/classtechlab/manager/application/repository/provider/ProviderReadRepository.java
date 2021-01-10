package com.classtechlab.manager.application.repository.provider;

import com.classtechlab.manager.domain.model.provider.Provider;
import com.classtechlab.manager.domain.model.provider.ProviderId;
import com.classtechlab.manager.domain.type.item.Pack;

public interface ProviderReadRepository {
    Pack<Provider> readAll();

    Provider read(final ProviderId id);
}

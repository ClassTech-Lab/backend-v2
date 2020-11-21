package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.provider.ProviderId;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PracticeProviders {
    private final PracticeId id;
    private final Set<ProviderId> providerIds;

    public PracticeProviders(final PracticeId id, final Set<ProviderId> providerIds) {
        this.id = id;
        this.providerIds = Collections.unmodifiableSet(providerIds);
    }

    public PracticeProviders add(final ProviderId providerId) {
        final Set<ProviderId> providerIds = new HashSet<>(this.providerIds);
        providerIds.add(providerId);
        return new PracticeProviders(this.id, providerIds);
    }

    public PracticeProviders remove(final ProviderId providerId) {
        final Set<ProviderId> providerIds = new HashSet<>(this.providerIds);
        providerIds.remove(providerId);
        return new PracticeProviders(this.id, providerIds);
    }
}

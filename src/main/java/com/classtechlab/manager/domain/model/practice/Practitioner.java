package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.Type;

import java.util.Collections;
import java.util.Set;

public class Practitioner {
    private final PracticeId id;
    private final Organization organization;
    private final Set<Type> types;

    public Practitioner(final PracticeId id, final Organization organization, final Set<Type> types) {
        this.id = id;
        this.organization = organization;
        this.types = Collections.unmodifiableSet(types);
    }
}

package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.type.school.School;

import java.util.Collections;
import java.util.Set;

public class Practitioner {
    private final PracticeId id;
    private final Organization organization;
    private final Set<School> schools;

    public Practitioner(final PracticeId id, final Organization organization, final Set<School> schools) {
        this.id = id;
        this.organization = organization;
        this.schools = Collections.unmodifiableSet(schools);
    }
}

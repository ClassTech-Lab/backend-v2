package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.school.School;
import com.classtechlab.manager.domain.model.school.type.Type;

import java.util.Collections;
import java.util.Set;

public class Practitioner {
    private final PracticeId id;
    private final School school;
    private final Set<Type> types;

    public Practitioner(final PracticeId id, final School school, final Set<Type> types) {
        this.id = id;
        this.school = school;
        this.types = Collections.unmodifiableSet(types);
    }
}

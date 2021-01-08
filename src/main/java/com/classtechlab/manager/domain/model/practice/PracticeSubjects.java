package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.type.school.Subject;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PracticeSubjects {
    private final PracticeId id;
    private final Set<Subject> subjects;

    public PracticeSubjects(final PracticeId id, final Set<Subject> subjects) {
        this.id = id;
        this.subjects = Collections.unmodifiableSet(subjects);
    }

    public PracticeSubjects add(final Subject subject) {
        final Set<Subject> subjects = new HashSet<>(this.subjects);
        subjects.add(subject);
        return new PracticeSubjects(this.id, subjects);
    }

    public PracticeSubjects remove(final Subject subject) {
        final Set<Subject> subjects = new HashSet<>(this.subjects);
        subjects.remove(subject);
        return new PracticeSubjects(this.id, subjects);
    }
}

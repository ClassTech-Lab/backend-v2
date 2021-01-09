package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.school.Subjects;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PracticeSubjects {
    private final PracticeId id;
    private final Set<Subjects> subjects;

    public PracticeSubjects(final PracticeId id, final Set<Subjects> subjects) {
        this.id = id;
        this.subjects = Collections.unmodifiableSet(subjects);
    }

    public PracticeSubjects add(final Subjects subject) {
        final Set<Subjects> subjects = new HashSet<>(this.subjects);
        subjects.add(subject);
        return new PracticeSubjects(this.id, subjects);
    }

    public PracticeSubjects remove(final Subjects subject) {
        final Set<Subjects> subjects = new HashSet<>(this.subjects);
        subjects.remove(subject);
        return new PracticeSubjects(this.id, subjects);
    }
}

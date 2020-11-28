package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.school.subject.SubjectId;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PracticeSubjects {
    private final PracticeId id;
    private final Set<SubjectId> subjectIds;

    public PracticeSubjects(final PracticeId id, final Set<SubjectId> subjectIds) {
        this.id = id;
        this.subjectIds = Collections.unmodifiableSet(subjectIds);
    }

    public PracticeSubjects add(final SubjectId subjectId) {
        final Set<SubjectId> subjectIds = new HashSet<>(this.subjectIds);
        subjectIds.add(subjectId);
        return new PracticeSubjects(this.id, subjectIds);
    }

    public PracticeSubjects remove(final SubjectId subjectId) {
        final Set<SubjectId> subjectIds = new HashSet<>(this.subjectIds);
        subjectIds.remove(subjectId);
        return new PracticeSubjects(this.id, subjectIds);
    }
}

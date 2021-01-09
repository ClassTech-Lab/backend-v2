package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.school.Grade;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PracticeGrades {
    private final PracticeId practiceId;
    private final Set<Grade> grades;

    public PracticeGrades(final PracticeId practiceId, final Set<Grade> grades) {
        this.practiceId = practiceId;
        this.grades = Collections.unmodifiableSet(grades);
    }

    PracticeGrades add(final Grade grade) {
        Set<Grade> grades = new HashSet<>(this.grades);
        grades.add(grade);
        return new PracticeGrades(this.practiceId, grades);
    }

    public PracticeGrades remove(final Grade grade) {
        final Set<Grade> grades = new HashSet<>(this.grades);
        grades.remove(grade);
        return new PracticeGrades(this.practiceId, grades);
    }
}

package com.classtechlab.manager.domain.type.school;

import com.classtechlab.manager.domain.type.name.Name;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 学年
 */
public class Grade {
    private final Name name;
    private final Set<Subject> subjects;

    public Grade(final Name name, final Set<Subject> subjects) {
        this.name = name;
        this.subjects = Collections.unmodifiableSet(subjects);
    }

    public Grade add(final Subject subject) {
        final Set<Subject> grades = new HashSet<>(this.subjects);
        grades.add(subject);
        return new Grade(this.name, grades);
    }

    public Grade remove(final Subject subject) {
        final Set<Subject> grades = new HashSet<>(this.subjects);
        grades.remove(subject);
        return new Grade(this.name, grades);
    }
}

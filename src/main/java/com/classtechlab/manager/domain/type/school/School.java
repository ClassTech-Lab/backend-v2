package com.classtechlab.manager.domain.type.school;

import com.classtechlab.manager.domain.type.name.Name;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 学校
 */
public class School {
    private final Name name;
    private final Set<Grade> grades;

    private School(final Name name, final Set<Grade> grades) {
        this.name = name;
        this.grades = Collections.unmodifiableSet(grades);
    }

    public School add(final Grade grade) {
        final Set<Grade> grades = new HashSet<>(this.grades);
        grades.add(grade);
        return new School(this.name, grades);
    }

    public School remove(final Grade grade) {
        final Set<Grade> grades = new HashSet<>(this.grades);
        grades.remove(grade);
        return new School(this.name, grades);
    }
}

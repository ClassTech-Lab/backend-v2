package com.classtechlab.manager.domain.model.school.type;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 学校種別
 */
public class Type {
    private final TypeName name;
    private final Set<Grade> grades;

    private Type(final TypeName name, final Set<Grade> grades) {
        this.name = name;
        this.grades = Collections.unmodifiableSet(grades);
    }

    public Type add(final Grade grade) {
        final Set<Grade> grades = new HashSet<>(this.grades);
        grades.add(grade);
        return new Type(this.name, grades);
    }

    public Type remove(final Grade grade) {
        final Set<Grade> grades = new HashSet<>(this.grades);
        grades.remove(grade);
        return new Type(this.name, grades);
    }
}

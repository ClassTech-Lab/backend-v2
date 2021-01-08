package com.classtechlab.manager.domain.type.school;

import com.classtechlab.manager.domain.type.name.Name;

/**
 * 科目
 */
public class Subject {
    private final Name name;

    public Subject(final Name name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Subject subject = (Subject) o;

        return this.name.equals(subject.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}

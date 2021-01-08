package com.classtechlab.manager.domain.type.school;

import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 科目
 */
@JsonSerialize(using = SubjectSerializer.class)
public class Subject {
    private final Name name;

    public Subject(final Name name) {
        this.name = name;
    }

    private Name name() {
        return this.name;
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

    static class POJO {
        private String name;

        static POJO parse(final Subject subject) {
            final POJO pojo = new POJO();
            pojo.name = subject.name().string();
            return pojo;
        }
    }
}

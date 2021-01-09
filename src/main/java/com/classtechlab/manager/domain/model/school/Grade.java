package com.classtechlab.manager.domain.model.school;

import com.classtechlab.manager.domain.type.name.Name;

/**
 * 学年
 */
public class Grade {
    private final Name name;
    private final Subjects subjects;

    public Grade(final Name name, final Subjects subjects) {
        this.name = name;
        this.subjects = subjects;
    }
}

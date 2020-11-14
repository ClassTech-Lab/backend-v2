package com.classtechlab.manager.domain.model.grade;

public class Grade {
    private final GradeId id;
    private final GradeName name;

    public Grade(final GradeId id, final GradeName name) {
        this.id = id;
        this.name = name;
    }
}

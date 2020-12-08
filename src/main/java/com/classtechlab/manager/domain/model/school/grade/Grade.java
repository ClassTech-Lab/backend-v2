package com.classtechlab.manager.domain.model.school.grade;

/**
 * 学年
 */
public class Grade {
    private final GradeId id;
    private final GradeName name;

    public Grade(final GradeId id, final GradeName name) {
        this.id = id;
        this.name = name;
    }
}

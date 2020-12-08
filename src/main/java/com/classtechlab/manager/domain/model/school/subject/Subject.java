package com.classtechlab.manager.domain.model.school.subject;

/**
 * 科目
 */
public class Subject {
    private final SubjectId id;
    private final SubjectName name;

    public Subject(final SubjectId id, final SubjectName name) {
        this.id = id;
        this.name = name;
    }
}

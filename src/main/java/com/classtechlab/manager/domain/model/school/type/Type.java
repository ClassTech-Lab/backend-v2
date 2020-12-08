package com.classtechlab.manager.domain.model.school.type;

import com.classtechlab.manager.domain.model.school.grade.GradeId;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 学校種別
 */
public class Type {
    private final TypeId id;
    private final TypeName name;
    private final Set<GradeId> gradeIds;

    private Type(final TypeId id, final TypeName name, final Set<GradeId> gradeIds) {
        this.id = id;
        this.name = name;
        this.gradeIds = Collections.unmodifiableSet(gradeIds);
    }

    public Type add(final GradeId gradeId) {
        final Set<GradeId> gradeIds = new HashSet<>(this.gradeIds);
        gradeIds.add(gradeId);
        return new Type(this.id, this.name, gradeIds);
    }

    public Type remove(final GradeId gradeId) {
        final Set<GradeId> gradeIds = new HashSet<>(this.gradeIds);
        gradeIds.remove(gradeId);
        return new Type(this.id, this.name, gradeIds);
    }
}

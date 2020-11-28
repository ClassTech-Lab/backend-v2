package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.school.grade.GradeId;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeGrades {
    private final PracticeId practiceId;
    private final List<GradeId> gradeIdList;

    public PracticeGrades(final PracticeId practiceId, final List<GradeId> gradeIdList) {
        this.practiceId = practiceId;
        this.gradeIdList = Collections.unmodifiableList(gradeIdList);
    }

    PracticeGrades add(final GradeId gradeId) {
        List<GradeId> gradeIdList = new ArrayList<>(this.gradeIdList);
        gradeIdList.add(gradeId);
        return new PracticeGrades(this.practiceId, gradeIdList);
    }

    public PracticeGrades remove(final GradeId gradeId) {
        final List<GradeId> gradeIdList = new ArrayList<>(this.gradeIdList);
        gradeIdList.remove(gradeId);
        return new PracticeGrades(this.practiceId, gradeIdList);
    }
}

package com.classtechlab.manager.application.repository.school;

import com.classtechlab.manager.domain.model.school.School;
import com.classtechlab.manager.domain.model.school.SchoolId;

public interface SchoolSaveRepository {
    SchoolId save(final School school);
}

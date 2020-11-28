package com.classtechlab.manager.application.repository.practice;

import com.classtechlab.manager.domain.model.practice.Practice;
import com.classtechlab.manager.domain.model.practice.PracticeId;

public interface PracticeSaveRepository {
    PracticeId save(final Practice practice);
}

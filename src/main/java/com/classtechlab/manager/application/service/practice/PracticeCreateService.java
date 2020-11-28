package com.classtechlab.manager.application.service.practice;

import com.classtechlab.manager.application.repository.practice.PracticeSaveRepository;
import com.classtechlab.manager.domain.model.practice.Practice;
import com.classtechlab.manager.domain.model.practice.PracticeId;
import com.classtechlab.manager.domain.model.practice.content.PracticeContent;
import com.classtechlab.manager.domain.model.school.SchoolId;

public class PracticeCreateService {
    private PracticeSaveRepository practiceSaveRepository;

    public PracticeId create(final PracticeContent content, final SchoolId schoolId) {
        return practiceSaveRepository.save(new Practice(content, schoolId));
    }
}

package com.classtechlab.manager.application.service.practice;

import com.classtechlab.manager.application.repository.practice.PracticeSaveRepository;
import com.classtechlab.manager.domain.model.practice.Practice;
import com.classtechlab.manager.domain.model.practice.PracticeId;
import com.classtechlab.manager.domain.model.practice.content.PracticeContent;

public class PracticeCreateService {
    private PracticeSaveRepository practiceSaveRepository;

    public PracticeId create(final PracticeContent content) {
        return practiceSaveRepository.save(new Practice(content));
    }
}

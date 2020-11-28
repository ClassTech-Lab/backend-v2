package com.classtechlab.manager.application.service.school;

import com.classtechlab.manager.application.repository.school.SchoolSaveRepository;
import com.classtechlab.manager.domain.model.school.School;
import com.classtechlab.manager.domain.model.school.SchoolBody;
import com.classtechlab.manager.domain.model.school.SchoolId;

public class SchoolCreateService {
    private SchoolSaveRepository schoolSaveRepository;

    public SchoolId create(final SchoolBody body) {
        return schoolSaveRepository.save(new School(body));
    }
}

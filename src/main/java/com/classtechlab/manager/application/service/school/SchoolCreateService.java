package com.classtechlab.manager.application.service.school;

import com.classtechlab.manager.application.repository.school.SchoolSaveRepository;
import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;

public class SchoolCreateService {
    private SchoolSaveRepository schoolSaveRepository;

    public OrganizationId create(final Organization organization) {
        return schoolSaveRepository.save(organization);
    }
}

package com.classtechlab.manager.application.service.school;

import com.classtechlab.manager.application.repository.school.OrganizationSaveRepository;
import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;

public class OrganizationSaveService {
    private OrganizationSaveRepository organizationSaveRepository;

    public OrganizationId create(final Organization organization) {
        this.organizationSaveRepository.save(organization);
        return organization.id();
    }
}

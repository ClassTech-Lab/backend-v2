package com.classtechlab.manager.application.service.organization;

import com.classtechlab.manager.application.repository.organization.OrganizationSaveRepository;
import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;
import org.springframework.stereotype.Service;

@Service
public class OrganizationSaveService {
    private final OrganizationSaveRepository organizationSaveRepository;

    public OrganizationSaveService(final OrganizationSaveRepository organizationSaveRepository) {
        this.organizationSaveRepository = organizationSaveRepository;
    }

    public OrganizationId create(final Organization organization) {
        this.organizationSaveRepository.create(organization);
        return organization.id();
    }
}

package com.classtechlab.manager.infrastructure.datasource.organization;

import com.classtechlab.manager.application.repository.organization.OrganizationSaveRepository;
import com.classtechlab.manager.domain.model.organization.Organization;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationSaveDatasource implements OrganizationSaveRepository {
    private final OrganizationMapper organizationMapper;

    public OrganizationSaveDatasource(final OrganizationMapper organizationMapper) {
        this.organizationMapper = organizationMapper;
    }

    @Override
    public void create(final Organization organization) {
        this.organizationMapper.insert(organization);
    }

    @Override
    public boolean modify(final Organization organization) {
        return this.organizationMapper.update(organization);
    }
}

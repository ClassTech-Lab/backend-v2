package com.classtechlab.manager.infrastructure.datasource.organization;

import com.classtechlab.manager.application.repository.organization.OrganizationReadRepository;
import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;
import com.classtechlab.manager.domain.type.item.Pack;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationReadDatasource implements OrganizationReadRepository {
    private final OrganizationMapper organizationMapper;

    public OrganizationReadDatasource(final OrganizationMapper organizationMapper) {
        this.organizationMapper = organizationMapper;
    }

    @Override
    public Pack<Organization> readAll() {
        return new Pack<>(this.organizationMapper.findAll());
    }

    @Override
    public Organization read(final OrganizationId id) {
        return this.organizationMapper.findBy(id);
    }
}

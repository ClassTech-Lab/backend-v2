package com.classtechlab.manager.infrastructure.datasource.organization;

import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
interface OrganizationMapper {
    void insert(final Organization organization);

    List<Organization> findAll();

    Organization findBy(final OrganizationId id);

    boolean update(final Organization organization);

    boolean delete(final Organization organization);
}

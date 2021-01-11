package com.classtechlab.manager.application.repository.organization;

import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;
import com.classtechlab.manager.domain.type.item.Pack;

public interface OrganizationReadRepository {
    Pack<Organization> readAll();

    Organization read(final OrganizationId id);
}

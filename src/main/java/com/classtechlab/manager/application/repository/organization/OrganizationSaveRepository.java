package com.classtechlab.manager.application.repository.organization;

import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;

public interface OrganizationSaveRepository {
    void save(final Organization organization);
}

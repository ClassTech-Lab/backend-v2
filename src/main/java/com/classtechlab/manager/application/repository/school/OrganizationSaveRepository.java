package com.classtechlab.manager.application.repository.school;

import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;

public interface OrganizationSaveRepository {
    void save(final Organization organization);
}

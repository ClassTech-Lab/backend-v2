package com.classtechlab.manager.application.repository.school;

import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;

public interface SchoolSaveRepository {
    OrganizationId save(final Organization organization);
}

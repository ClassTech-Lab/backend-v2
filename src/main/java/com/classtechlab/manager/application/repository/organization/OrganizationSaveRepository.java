package com.classtechlab.manager.application.repository.organization;

import com.classtechlab.manager.domain.model.organization.Organization;

public interface OrganizationSaveRepository {
    void create(final Organization organization);

    boolean modify(final Organization organization);
}

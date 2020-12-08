package com.classtechlab.manager.application.repository.school;

import com.classtechlab.manager.domain.model.school.Organization;
import com.classtechlab.manager.domain.model.school.OrganizationId;

public interface SchoolSaveRepository {
    OrganizationId save(final Organization organization);
}

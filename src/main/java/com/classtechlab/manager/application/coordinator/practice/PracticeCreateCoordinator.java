package com.classtechlab.manager.application.coordinator.practice;

import com.classtechlab.manager.application.service.practice.PracticeCreateService;
import com.classtechlab.manager.application.service.school.OrganizationSaveService;
import com.classtechlab.manager.domain.model.practice.PracticeId;
import com.classtechlab.manager.domain.model.practice.content.PracticeContent;
import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;

public class PracticeCreateCoordinator {
    private PracticeCreateService practiceCreateService;
    private OrganizationSaveService organizationSaveService;

    public PracticeId create(final PracticeContent content, final Organization organization) {
        final OrganizationId organizationId = organizationSaveService.create(organization);
        return practiceCreateService.create(content);
    }
}

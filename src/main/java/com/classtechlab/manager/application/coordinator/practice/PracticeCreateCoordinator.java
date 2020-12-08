package com.classtechlab.manager.application.coordinator.practice;

import com.classtechlab.manager.application.service.practice.PracticeCreateService;
import com.classtechlab.manager.application.service.school.SchoolCreateService;
import com.classtechlab.manager.domain.model.practice.PracticeId;
import com.classtechlab.manager.domain.model.practice.content.PracticeContent;
import com.classtechlab.manager.domain.model.school.Organization;
import com.classtechlab.manager.domain.model.school.OrganizationId;

public class PracticeCreateCoordinator {
    private PracticeCreateService practiceCreateService;
    private SchoolCreateService schoolCreateService;

    public PracticeId create(final PracticeContent content, final Organization organization) {
        final OrganizationId organizationId = schoolCreateService.create(organization);
        return practiceCreateService.create(content);
    }
}

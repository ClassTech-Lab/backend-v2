package com.classtechlab.manager.presentation.controller.organization;

import com.classtechlab.manager.application.service.organization.OrganizationSaveService;
import com.classtechlab.manager.domain.model.organization.Organization;
import com.classtechlab.manager.domain.model.organization.OrganizationId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("organization")
public class OrganizationController {
    private final OrganizationSaveService organizationSaveService;

    public OrganizationController(final OrganizationSaveService organizationSaveService) {
        this.organizationSaveService = organizationSaveService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrganizationId post(@RequestBody final Organization organization) {
        return this.organizationSaveService.create(organization);
    }
}

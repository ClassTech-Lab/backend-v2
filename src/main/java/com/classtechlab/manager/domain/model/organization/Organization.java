package com.classtechlab.manager.domain.model.organization;

public class Organization {
    private final OrganizationId id;
    private final OrganizationName name;

    public Organization(final OrganizationId id, final OrganizationName name) {
        this.id = id;
        this.name = name;
    }
}

package com.classtechlab.manager.domain.model.organization;

import com.classtechlab.manager.domain.type.item.Identifiable;

/**
 * 運営組織
 */
public class Organization implements Identifiable<Organization> {
    private final OrganizationId id;
    private final ManagementBody managementBody;

    private Organization(final OrganizationId id, final ManagementBody managementBody) {
        this.id = id;
        this.managementBody = managementBody;
    }

    public Organization(final ManagementBody managementBody) {
        this(new OrganizationId(), managementBody);
    }

    private OrganizationId id() {
        return this.id;
    }

    @Override
    public boolean isEqualTo(final Organization other) {
        return this.id().isEquals(other.id());
    }
}

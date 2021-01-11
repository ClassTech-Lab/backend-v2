package com.classtechlab.manager.domain.model.organization;

import com.classtechlab.manager.domain.model.school.ManagementBody;
import com.classtechlab.manager.domain.model.school.School;
import com.classtechlab.manager.domain.type.item.Identifiable;

import java.util.Arrays;

/**
 * 運営組織
 */
public class Organization implements Identifiable<Organization> {
    private final OrganizationId id;
    private final ManagementBody managementBody;
    private final School[] schools;

    Organization(final OrganizationId id, final ManagementBody managementBody, final School... schools) {
        this.id = id;
        this.managementBody = managementBody;
        this.schools = Arrays.copyOf(schools, schools.length);
    }

    public Organization(final ManagementBody managementBody, final School... schools) {
        this(new OrganizationId(), managementBody, schools);
    }

    public OrganizationId id() {
        return this.id;
    }

    @Override
    public boolean isEqualTo(final Organization other) {
        return this.id().isEquals(other.id());
    }
}

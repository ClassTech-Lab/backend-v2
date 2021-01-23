package com.classtechlab.manager.domain.model.organization;

import com.classtechlab.manager.domain.model.school.ManagementBody;
import com.classtechlab.manager.domain.model.school.School;
import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Arrays;
import java.util.UUID;

/**
 * 運営組織
 */
@JsonDeserialize(using = OrganizationDeserializer.class)
public class Organization implements Identifiable<Organization> {
    private final OrganizationId id;
    private final ManagementBody managementBody;
    private final Name name;
    private final School[] schools;

    Organization(final OrganizationId id, final ManagementBody managementBody, final Name name, final School... schools) {
        this.id = id;
        this.managementBody = managementBody;
        this.name = name;
        this.schools = Arrays.copyOf(schools, schools.length);
    }

    public Organization(final ManagementBody managementBody, final Name name, final School... schools) {
        this(new OrganizationId(), managementBody, name, schools);
    }

    public OrganizationId id() {
        return this.id;
    }

    private Name name() {
        return this.name;
    }

    private ManagementBody managementBody() {
        return this.managementBody;
    }

    @Override
    public boolean isEqualTo(final Organization other) {
        return this.id().isEquals(other.id());
    }

    static class POJO {
        private UUID id;
        private String managementBody;
        private String name;

        static POJO parse(final Organization organization) {
            final Organization.POJO pojo = new Organization.POJO();
            pojo.id = organization.id().uuid();
            pojo.name = organization.name().string();
            pojo.managementBody = organization.managementBody.name().string();
            return pojo;
        }

        Organization construct() {
            final ManagementBody managementBody = new ManagementBody(new Name(this.managementBody));
            final Name name = new Name(this.name);
            if (this.id == null) return new Organization(managementBody, name);
            return new Organization(new OrganizationId(), managementBody, name);
        }
    }
}

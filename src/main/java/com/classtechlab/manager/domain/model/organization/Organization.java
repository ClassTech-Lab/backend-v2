package com.classtechlab.manager.domain.model.organization;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.school.Type;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 運営組織
 */
public class Organization implements Identifiable<Organization> {
    private final OrganizationId id;
    private final Set<Type> types;
    private final ManagementBody managementBody;

    private Organization(final OrganizationId id, final Set<Type> types, final ManagementBody managementBody) {
        this.id = id;
        this.types = Collections.unmodifiableSet(types);
        this.managementBody = managementBody;
    }

    public Organization(final Set<Type> types, final ManagementBody managementBody) {
        this(new OrganizationId(), types, managementBody);
    }

    private OrganizationId id() {
        return this.id;
    }

    public Organization add(final Type typeId) {
        final Set<Type> typeIds = new HashSet<>(this.types);
        typeIds.add(typeId);
        return new Organization(this.id, typeIds, this.managementBody);
    }

    boolean has(final Type typeId) {
        return this.types.contains(typeId);
    }

    @Override
    public boolean isEqualTo(final Organization other) {
        return this.id().isEquals(other.id());
    }
}

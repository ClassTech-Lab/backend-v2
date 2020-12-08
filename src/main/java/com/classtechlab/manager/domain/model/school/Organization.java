package com.classtechlab.manager.domain.model.school;

import com.classtechlab.manager.domain.model.school.managementBody.ManagementBody;
import com.classtechlab.manager.domain.model.school.type.TypeId;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 運営組織
 */
public class Organization {
    private final OrganizationId id;
    private final Set<TypeId> typeIds;
    private final ManagementBody managementBody;

    private Organization(final OrganizationId id, final Set<TypeId> typeIds, final ManagementBody managementBody) {
        this.id = id;
        this.typeIds = Collections.unmodifiableSet(typeIds);
        this.managementBody = managementBody;
    }

    public Organization(final Set<TypeId> typeIds, final ManagementBody managementBody) {
        this(new OrganizationId(), typeIds, managementBody);
    }

    public Organization add(final TypeId typeId) {
        final Set<TypeId> typeIds = new HashSet<>(this.typeIds);
        typeIds.add(typeId);
        return new Organization(this.id, typeIds, this.managementBody);
    }

    boolean has(final TypeId typeId) {
        return this.typeIds.contains(typeId);
    }
}

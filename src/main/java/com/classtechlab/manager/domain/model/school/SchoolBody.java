package com.classtechlab.manager.domain.model.school;

import com.classtechlab.manager.domain.model.school.managementBody.ManagementBodyId;
import com.classtechlab.manager.domain.model.school.type.TypeId;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SchoolBody {
    private final Set<TypeId> typeIds;
    private final ManagementBodyId managementBodyId;
    private final Organization organization;

    private SchoolBody(final Set<TypeId> typeIds, final ManagementBodyId managementBodyId, final Organization organization) {
        this.typeIds = Collections.unmodifiableSet(typeIds);
        this.managementBodyId = managementBodyId;
        this.organization = organization;
    }

    SchoolBody add(final TypeId typeId) {
        final Set<TypeId> typeIds = new HashSet<>(this.typeIds);
        typeIds.add(typeId);
        return new SchoolBody(typeIds, this.managementBodyId, this.organization);
    }

    boolean has(final TypeId typeId) {
        return this.typeIds.contains(typeId);
    }
}

package com.classtechlab.manager.domain.model.school;

import com.classtechlab.manager.domain.model.school.managementBody.ManagementBody;
import com.classtechlab.manager.domain.model.school.type.Type;

import java.util.Collections;
import java.util.Set;

public class School {
    private final SchoolId id;
    private final Set<Type> types;
    private final ManagementBody managementBody;
    private final Organization organization;

    public School(final SchoolId id, final Set<Type> types, final ManagementBody managementBody, final Organization organization) {
        this.id = id;
        this.types = Collections.unmodifiableSet(types);
        this.managementBody = managementBody;
        this.organization = organization;
    }

    public School(final Set<Type> types, final ManagementBody managementBody, final Organization organization) {
        this(new SchoolId(), types, managementBody, organization);
    }

    public boolean has(final Type type) {
        return this.types.contains(type);
    }
}

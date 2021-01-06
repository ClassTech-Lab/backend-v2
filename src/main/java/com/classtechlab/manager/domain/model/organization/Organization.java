package com.classtechlab.manager.domain.model.organization;

import com.classtechlab.manager.domain.type.item.Identifiable;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 運営組織
 */
public class Organization implements Identifiable<Organization> {
    private final OrganizationId id;
    private final ManagementBody managementBody;
    private final Set<Type> types;
    private final Set<Department> departments;

    private Organization(final OrganizationId id, final ManagementBody managementBody, final Set<Type> types, final Set<Department> departments) {
        this.id = id;
        this.types = Collections.unmodifiableSet(types);
        this.departments = Collections.unmodifiableSet(departments);
        this.managementBody = managementBody;
    }

    public Organization(final Set<Type> types, final ManagementBody managementBody, final Set<Department> departments) {
        this(new OrganizationId(), managementBody, types, departments);
    }

    private OrganizationId id() {
        return this.id;
    }

    public Organization add(final Type type) {
        final Set<Type> types = new HashSet<>(this.types);
        types.add(type);
        return new Organization(this.id(), this.managementBody, types, this.departments);
    }

    public Organization remove(final Type type) {
        final Set<Type> types = new HashSet<>(this.types);
        types.remove(type);
        return new Organization(this.id(), this.managementBody, types, this.departments);
    }

    public Organization add(final Department department) {
        final Set<Department> departments = new HashSet<>(this.departments);
        departments.add(department);
        return new Organization(this.id(), this.managementBody, this.types, departments);
    }

    public Organization remove(final Department department) {
        final Set<Department> departments = new HashSet<>(this.departments);
        departments.remove(department);
        return new Organization(this.id(), this.managementBody, this.types, departments);
    }

    boolean has(final Type typeId) {
        return this.types.contains(typeId);
    }

    @Override
    public boolean isEqualTo(final Organization other) {
        return this.id().isEquals(other.id());
    }
}

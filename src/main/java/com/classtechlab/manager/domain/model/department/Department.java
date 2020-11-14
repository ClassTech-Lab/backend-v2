package com.classtechlab.manager.domain.model.department;

public class Department {
    private final DepartmentId id;
    private final DepartmentName name;

    public Department(final DepartmentId id, final DepartmentName name) {
        this.id = id;
        this.name = name;
    }
}

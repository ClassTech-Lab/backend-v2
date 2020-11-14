package com.classtechlab.manager.domain.model.schooltype;

public class SchoolType {
    private final SchoolTypeId id;
    private final SchoolTypeName name;

    public SchoolType(final SchoolTypeId id, final SchoolTypeName name) {
        this.id = id;
        this.name = name;
    }
}
package com.classtechlab.manager.domain.model.school;

import com.classtechlab.manager.domain.model.school.type.TypeId;

public class School {
    private final SchoolId id;
    private final SchoolBody body;

    private School(final SchoolId id, final SchoolBody body) {
        this.id = id;
        this.body = body;
    }

    public School(final SchoolBody body) {
        this(new SchoolId(), body);
    }

    public School add(final TypeId typeId) {
        return new School(this.id, this.body.add(typeId));
    }

    public boolean has(final TypeId typeId) {
        return this.body.has(typeId);
    }
}

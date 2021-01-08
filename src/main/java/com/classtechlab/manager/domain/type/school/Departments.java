package com.classtechlab.manager.domain.type.school;

import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.stream.Stream;

/**
 * 学科
 */
@JsonSerialize(using = DepartmentsSerializer.class)
public class Departments {
    private final Name[] names;

    public Departments(final Name... names) {
        this.names = names;
    }

    private Name[] names() {
        return this.names;
    }

    String[] strings() {
        return Stream.of(this.names()).map(Name::string).toArray(String[]::new);
    }
}

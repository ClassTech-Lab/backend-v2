package com.classtechlab.manager.domain.type.school;

import com.classtechlab.manager.domain.type.name.Name;

import java.util.stream.Stream;

/**
 * 科目
 */
public class Subjects {
    private final Name[] names;

    public Subjects(final Name[] names) {
        this.names = names;
    }

    private Name[] names() {
        return this.names;
    }

    String[] strings() {
        return Stream.of(this.names()).map(Name::string).toArray(String[]::new);
    }
}

package com.classtechlab.manager.domain.type.name;

public class Name {
    private String value;

    private Name() {
    }

    public Name(final String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}

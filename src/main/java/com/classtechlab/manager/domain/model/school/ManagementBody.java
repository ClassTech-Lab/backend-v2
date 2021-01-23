package com.classtechlab.manager.domain.model.school;

import com.classtechlab.manager.domain.type.name.Name;

/**
 * 運営母体
 */
public class ManagementBody {
    private final Name name;

    public ManagementBody(final Name name) {
        this.name = name;
    }

    public Name name() {
        return this.name;
    }
}

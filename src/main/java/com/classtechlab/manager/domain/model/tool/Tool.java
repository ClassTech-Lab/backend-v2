package com.classtechlab.manager.domain.model.tool;

import com.classtechlab.manager.domain.type.id.Id;
import com.classtechlab.manager.domain.type.name.Name;

public class Tool {
    private final Id id;
    private final Name name;

    public Tool(final Name name) {
        this.id = new Id();
        this.name = name;
    }
}

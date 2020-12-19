package com.classtechlab.manager.domain.model.tool;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;

public class Tool implements Identifiable<Tool> {
    private final ToolId id;
    private final Name name;

    public Tool(final Name name) {
        this.id = new ToolId();
        this.name = name;
    }

    @Override
    public boolean isEqualTo(final Tool other) {
        return this.id.isEqualTo(other.id);
    }
}

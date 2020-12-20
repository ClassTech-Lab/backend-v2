package com.classtechlab.manager.domain.model.tool;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;

import java.util.UUID;

public class Tool implements Identifiable<Tool> {
    ToolId id;
    Name name;

    private Tool() {
    }

    Tool(final Name name) {
        this.id = new ToolId();
        this.name = name;
    }

    public PlainObject toPlainObject() {
        return new PlainObject();
    }

    @Override
    public boolean isEqualTo(final Tool other) {
        return this.id.isEqualTo(other.id);
    }

    public class PlainObject {
        private final UUID id = Tool.this.id.value();
        private final String name = Tool.this.name.value();

        private PlainObject() {
        }
    }
}

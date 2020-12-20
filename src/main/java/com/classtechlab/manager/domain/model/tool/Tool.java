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
        return new PlainObject(this.id.value, this.name.value());
    }

    @Override
    public boolean isEqualTo(final Tool other) {
        return this.id.isEqualTo(other.id);
    }

    public static class PlainObject {
        private final UUID id;
        private final String name;

        private PlainObject(final UUID id, final String name) {
            this.id = id;
            this.name = name;
        }
    }
}

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

    public POJO toPOJO() {
        return new POJO(this.id.value, this.name.value());
    }

    @Override
    public boolean isEqualTo(final Tool other) {
        return this.id.isEqualTo(other.id);
    }

    public static class POJO {
        private final UUID id;
        private final String name;

        POJO(final UUID id, final String name) {
            this.id = id;
            this.name = name;
        }
    }
}

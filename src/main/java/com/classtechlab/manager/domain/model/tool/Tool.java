package com.classtechlab.manager.domain.model.tool;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class Tool implements Identifiable<Tool> {
    private ToolId id;
    private Name name;

    private Tool() {
    }

    private Tool(final Name name) {
        this.id = new ToolId();
        this.name = name;
    }

    public ToolId id() {
        return this.id;
    }

    public PlainObject toPlainObject() {
        return new PlainObject(this);
    }

    @Override
    public boolean isEqualTo(final Tool other) {
        return this.id.isEqualTo(other.id);
    }

    public static class PlainObject {
        private UUID id;
        private String name;

        private PlainObject() {
        }

        private PlainObject(final Tool tool) {
            this.id = tool.id.value();
            this.name = tool.name.value();
        }

        public Tool toTool() {
            if (this.id == null || StringUtils.isBlank(this.name)) throw new IllegalArgumentException();
            final Tool tool = new Tool(new Name(this.name));
            tool.id = new ToolId(this.id);
            return tool;
        }

        public Tool newTool() {
            if (StringUtils.isBlank(this.name)) throw new IllegalArgumentException();
            return new Tool(new Name(this.name));
        }
    }
}

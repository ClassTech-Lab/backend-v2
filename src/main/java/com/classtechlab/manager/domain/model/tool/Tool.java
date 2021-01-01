package com.classtechlab.manager.domain.model.tool;

import com.classtechlab.manager.domain.exception.IllegalArgumentException;
import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang3.StringUtils;

@JsonSerialize(using = ToolSerializer.class)
@JsonDeserialize(using = ToolDeserializer.class)
public class Tool implements Identifiable<Tool> {
    private ToolId id;
    private Name name;

    private Tool() {
    }

    Tool(final ToolId id, final Name name) {
        this.id = id;
        this.name = name;
    }

    Tool(final Name name) {
        this(new ToolId(), name);
    }

    public ToolId id() {
        return this.id;
    }

    Name name() {
        return this.name;
    }

    public Tool copy(final ToolId id) {
        return new Tool(id, this.name());
    }

    public Tool copy() {
        return new Tool(this.name());
    }

    @Override
    public boolean isEqualTo(final Tool other) {
        return this.id.isEqualTo(other.id);
    }

    public static class PlainObject {
        private String id;
        private String name;

        private PlainObject() {
        }

        private PlainObject(final Tool tool) {
            this.id = tool.id.string();
            this.name = tool.name.string();
        }

        public Tool toTool(final ToolId id) throws IllegalArgumentException {
            if (id == null || StringUtils.isBlank(this.name)) throw new IllegalArgumentException();
            return new Tool(id, new Name(this.name));
        }

        public Tool toTool() throws IllegalArgumentException {
            return this.toTool(new ToolId());
        }
    }
}

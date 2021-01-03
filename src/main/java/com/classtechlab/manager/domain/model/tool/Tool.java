package com.classtechlab.manager.domain.model.tool;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = ToolSerializer.class)
@JsonDeserialize(using = ToolDeserializer.class)
public class Tool implements Identifiable<Tool> {
    private ToolId id;
    private Name name;

    private Tool() {
    }

    private Tool(final ToolId id, final Name name) {
        this.id = id;
        this.name = name;
    }

    private Tool(final Name name) {
        this(new ToolId(), name);
    }

    public ToolId id() {
        return this.id;
    }

    private Name name() {
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

    static class POJO {
        private UUID id;
        private String name;

        static POJO parse(final Tool tool) {
            final POJO pojo = new POJO();
            pojo.id = tool.id().uuid();
            pojo.name = tool.name().string();
            return pojo;
        }

        Tool construct() {
            final Name name = new Name(this.name);
            if (this.id == null) return new Tool(name);
            return new Tool(new ToolId(this.id), name);
        }
    }
}

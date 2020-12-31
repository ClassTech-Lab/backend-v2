package com.classtechlab.manager.domain.model.tool;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = ToolIdSerializer.class)
public class ToolId {
    private final UUID value;

    ToolId(final UUID value) {
        this.value = value;
    }

    ToolId() {
        this(UUID.randomUUID());
    }

    String string() {
        return this.value.toString();
    }

    boolean isEqualTo(final ToolId other) {
        return this.value.equals(other.value);
    }

    public static class PlainObject {
        private final String id;

        private PlainObject(final ToolId toolId) {
            this.id = toolId.string();
        }
    }
}

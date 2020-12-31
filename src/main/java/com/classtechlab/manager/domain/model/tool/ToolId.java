package com.classtechlab.manager.domain.model.tool;

import java.util.UUID;

public class ToolId {
    private final UUID value;

    ToolId(final UUID value) {
        this.value = value;
    }

    ToolId() {
        this(UUID.randomUUID());
    }

    String value() {
        return this.value.toString();
    }

    public PlainObject toPlainObject() {
        return new PlainObject(this);
    }

    boolean isEqualTo(final ToolId other) {
        return this.value.equals(other.value);
    }

    public static class PlainObject {
        private final String id;

        private PlainObject(final ToolId toolId) {
            this.id = toolId.value();
        }
    }
}

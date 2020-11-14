package com.classtechlab.manager.domain.model.tool;

import java.util.UUID;

public class ToolId {
    private final UUID value;

    public ToolId(final UUID value) {
        this.value = value;
    }

    public ToolId() {
        this(UUID.randomUUID());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final ToolId toolId = (ToolId) o;

        return value.equals(toolId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

package com.classtechlab.manager.domain.model.tool;

import java.util.UUID;

public class ToolId {
    private final UUID value;

    public ToolId() {
        this.value = UUID.randomUUID();
    }

    boolean isEqualTo(final ToolId other) {
        return this.value.equals(other.value);
    }
}

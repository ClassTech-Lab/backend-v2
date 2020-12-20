package com.classtechlab.manager.domain.model.tool;

import java.util.UUID;

public class ToolId {
    private UUID value;

    ToolId(final UUID value) {
        this.value = value;
    }

    ToolId() {
        this(UUID.randomUUID());
    }

    UUID value() {
        return this.value;
    }

    boolean isEqualTo(final ToolId other) {
        return this.value.equals(other.value);
    }
}

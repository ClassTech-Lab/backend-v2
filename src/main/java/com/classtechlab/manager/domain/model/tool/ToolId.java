package com.classtechlab.manager.domain.model.tool;

import java.util.UUID;

public class ToolId {
    UUID value;

    ToolId(final UUID value) {
        this.value = value;
    }

    ToolId() {
        this(UUID.randomUUID());
    }

    boolean isEqualTo(final ToolId other) {
        return this.value.equals(other.value);
    }
}

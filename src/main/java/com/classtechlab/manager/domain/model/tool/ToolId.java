package com.classtechlab.manager.domain.model.tool;

import java.util.UUID;

public class ToolId {
    UUID value;

    ToolId() {
        this(UUID.randomUUID());
    }

    ToolId(final UUID value) {
        this.value = value;
    }

    boolean isEqualTo(final ToolId other) {
        return this.value.equals(other.value);
    }
}

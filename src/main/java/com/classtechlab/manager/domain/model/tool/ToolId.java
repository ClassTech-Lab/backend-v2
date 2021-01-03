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

    UUID uuid() {
        return this.value;
    }

    boolean isEqualTo(final ToolId other) {
        return this.value.equals(other.value);
    }

    static class POJO {
        private UUID id;

        static POJO parse(final ToolId toolId) {
            final POJO pojo = new POJO();
            pojo.id = toolId.uuid();
            return pojo;
        }
    }
}

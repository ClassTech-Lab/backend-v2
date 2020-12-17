package com.classtechlab.manager.domain.type.id;

import java.util.UUID;

public class Id {
    private final UUID value;

    public Id() {
        this.value = UUID.randomUUID();
    }

    public boolean equals(final Id other) {
        return this.value.equals(other.value);
    }
}

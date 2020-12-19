package com.classtechlab.manager.domain.type.item;

import java.util.HashSet;
import java.util.Set;

public class Pack<T extends Identifiable<T>> {
    private final Set<T> items;

    public Pack(final Set<T> items) {
        this.items = new HashSet<>(items);
    }
}

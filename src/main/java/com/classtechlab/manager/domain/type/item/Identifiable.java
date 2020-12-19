package com.classtechlab.manager.domain.type.item;

public interface Identifiable<T extends Identifiable<T>> {
    boolean isEqualTo(final T other);
}

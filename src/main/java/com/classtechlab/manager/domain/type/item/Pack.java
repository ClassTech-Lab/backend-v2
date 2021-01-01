package com.classtechlab.manager.domain.type.item;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@JsonSerialize(using = PackSerializer.class)
public class Pack<T extends Identifiable<T>> {
    private final List<T> items;

    public Pack(final List<T> items) {
        this.items = new ArrayList<>(items);
    }

    public Pack<T> sort(final Comparator<T> comparator) {
        return new Pack<T>(this.items.stream().sorted(comparator).collect(Collectors.toList()));
    }

    public <R> List<R> map(Function<? super T, ? extends R> mapper) {
        return this.items.stream().map(mapper).collect(Collectors.toUnmodifiableList());
    }

    List<T> toList() {
        return Collections.unmodifiableList(this.items);
    }
}

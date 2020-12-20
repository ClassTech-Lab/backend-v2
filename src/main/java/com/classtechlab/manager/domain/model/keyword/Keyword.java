package com.classtechlab.manager.domain.model.keyword;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;

import java.util.UUID;

public class Keyword implements Identifiable<Keyword> {
    KeywordId id;
    Name name;

    private Keyword() {
    }

    Keyword(final Name name) {
        this.id = new KeywordId();
        this.name = name;
    }

    public PlainObject toPlainObject() {
        return new PlainObject(this.id.value, this.name.value());
    }

    @Override
    public boolean isEqualTo(final Keyword other) {
        return this.id.isEqualTo(other.id);
    }

    public static class PlainObject {
        private final UUID id;
        private final String name;

        private PlainObject(final UUID id, final String name) {
            this.id = id;
            this.name = name;
        }
    }
}

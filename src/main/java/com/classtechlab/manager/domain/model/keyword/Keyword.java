package com.classtechlab.manager.domain.model.keyword;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = KeywordSerializer.class)
@JsonDeserialize(using = KeywordDeserializer.class)
public class Keyword implements Identifiable<Keyword> {
    private KeywordId id;
    private Name name;

    private Keyword() {
    }

    Keyword(final KeywordId id, final Name name) {
        this.id = id;
        this.name = name;
    }

    Keyword(final Name name) {
        this(new KeywordId(), name);
    }

    public KeywordId id() {
        return this.id;
    }

    public Name name() {
        return this.name;
    }

    public Keyword copy(final KeywordId id) {
        return new Keyword(id, this.name());
    }

    public Keyword copy() {
        return copy(new KeywordId());
    }

    @Override
    public boolean isEqualTo(final Keyword other) {
        return this.id.isEqualTo(other.id);
    }
}

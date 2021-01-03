package com.classtechlab.manager.domain.model.keyword;

import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.UUID;

@JsonSerialize(using = KeywordSerializer.class)
@JsonDeserialize(using = KeywordDeserializer.class)
public class Keyword implements Identifiable<Keyword> {
    private KeywordId id;
    private Name name;

    private Keyword() {
    }

    private Keyword(final KeywordId id, final Name name) {
        this.id = id;
        this.name = name;
    }

    private Keyword(final Name name) {
        this(new KeywordId(), name);
    }

    public KeywordId id() {
        return this.id;
    }

    private Name name() {
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

    static class POJO {
        private UUID id;
        private String name;

        static Keyword.POJO parse(final Keyword keyword) {
            final Keyword.POJO pojo = new Keyword.POJO();
            pojo.id = keyword.id().uuid();
            pojo.name = keyword.name().string();
            return pojo;
        }

        Keyword construct() {
            final Name name = new Name(this.name);
            if (this.id == null) return new Keyword(name);
            return new Keyword(new KeywordId(id), name);
        }
    }
}

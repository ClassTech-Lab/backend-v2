package com.classtechlab.manager.domain.model.keyword;

import com.classtechlab.manager.domain.exception.IllegalArgumentException;
import com.classtechlab.manager.domain.type.item.Identifiable;
import com.classtechlab.manager.domain.type.name.Name;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class Keyword implements Identifiable<Keyword> {
    private KeywordId id;
    private Name name;

    private Keyword() {
    }

    Keyword(final Name name) {
        this.id = new KeywordId();
        this.name = name;
    }

    public KeywordId id() {
        return this.id;
    }

    public PlainObject toPlainObject() {
        return new PlainObject(this);
    }

    @Override
    public boolean isEqualTo(final Keyword other) {
        return this.id.isEqualTo(other.id);
    }

    public static class PlainObject {
        private UUID id;
        private String name;

        private PlainObject() {
        }

        private PlainObject(final Keyword keyword) {
            this.id = keyword.id.value();
            this.name = keyword.name.value();
        }

        public Keyword toKeyword() throws IllegalArgumentException {
            if (this.id == null || StringUtils.isBlank(this.name)) throw new IllegalArgumentException();
            final Keyword keyword = new Keyword(new Name(this.name));
            keyword.id = new KeywordId(this.id);
            return keyword;
        }

        public Keyword newKeyword() throws IllegalArgumentException {
            if (StringUtils.isBlank(this.name)) throw new IllegalArgumentException();
            return new Keyword(new Name(this.name));
        }
    }
}

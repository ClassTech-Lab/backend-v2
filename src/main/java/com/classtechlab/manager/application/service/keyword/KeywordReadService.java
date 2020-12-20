package com.classtechlab.manager.application.service.keyword;

import com.classtechlab.manager.application.repository.keyword.KeywordReadRepository;
import com.classtechlab.manager.domain.model.keyword.Keyword;
import com.classtechlab.manager.domain.model.keyword.KeywordId;
import com.classtechlab.manager.domain.type.item.Pack;
import org.springframework.stereotype.Service;

@Service
public class KeywordReadService {
    private final KeywordReadRepository keywordReadRepository;

    public KeywordReadService(final KeywordReadRepository keywordReadRepository) {
        this.keywordReadRepository = keywordReadRepository;
    }

    public Pack<Keyword> readAll() {
        return this.keywordReadRepository.readAll();
    }

    public Keyword readBy(final KeywordId id) {
        return this.keywordReadRepository.read(id);
    }
}

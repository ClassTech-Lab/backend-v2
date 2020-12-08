package com.classtechlab.manager.application.repository.practice.image.url;

import com.classtechlab.manager.domain.model.practice.PracticeId;
import com.classtechlab.manager.domain.model.practice.PracticeImageUrl;

public interface PracticeImageUrlReadRepository {
    PracticeImageUrl read(final PracticeId practiceId);
}

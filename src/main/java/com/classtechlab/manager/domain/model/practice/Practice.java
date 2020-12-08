package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.practice.content.PracticeContent;

public class Practice {
    private final PracticeId id;
    private final PracticeContent content;

    public Practice(final PracticeId id, final PracticeContent content) {
        this.id = id;
        this.content = content;
    }

    public Practice(final PracticeContent content) {
        this(new PracticeId(), content);
    }
}

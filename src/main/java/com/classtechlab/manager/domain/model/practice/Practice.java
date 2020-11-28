package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.practice.content.PracticeContent;
import com.classtechlab.manager.domain.model.school.SchoolId;

public class Practice {
    private final PracticeId id;
    private final PracticeContent content;
    private final SchoolId schoolId;

    public Practice(final PracticeId id, final PracticeContent content, final SchoolId schoolId) {
        this.id = id;
        this.content = content;
        this.schoolId = schoolId;
    }

    public Practice(final PracticeContent practiceContent, final SchoolId schoolId) {
        this(new PracticeId(), practiceContent, schoolId);
    }
}

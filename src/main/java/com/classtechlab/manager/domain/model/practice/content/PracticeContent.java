package com.classtechlab.manager.domain.model.practice.content;

public class PracticeContent {
    private final PracticeName name;
    private final PracticeDetail detail;
    private final PracticeReportUrl url;

    public PracticeContent(final PracticeName name, final PracticeDetail detail, final PracticeReportUrl url) {
        this.name = name;
        this.detail = detail;
        this.url = url;
    }
}

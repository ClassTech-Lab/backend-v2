package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.tool.Tool;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PracticeTools {
    private final PracticeId id;
    private final Set<Tool> tools;

    public PracticeTools(final PracticeId id, final Set<Tool> tools) {
        if (tools.isEmpty()) throw new IllegalArgumentException();
        this.id = id;
        this.tools = Collections.unmodifiableSet(tools);
    }

    public PracticeTools add(final Tool tool) {
        final Set<Tool> tools = new HashSet<>(this.tools);
        tools.add(tool);
        return new PracticeTools(this.id, tools);
    }

    public PracticeTools remove(final Tool tool) {
        final Set<Tool> tools = new HashSet<>(this.tools);
        tools.remove(tool);
        return new PracticeTools(this.id, tools);
    }
}

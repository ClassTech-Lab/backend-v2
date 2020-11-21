package com.classtechlab.manager.domain.model.practice;

import com.classtechlab.manager.domain.model.tool.ToolId;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PracticeTools {
    private final PracticeId id;
    private final Set<ToolId> toolIds;

    public PracticeTools(final PracticeId id, final Set<ToolId> toolIds) {
        if (toolIds.isEmpty()) throw new IllegalArgumentException();
        this.id = id;
        this.toolIds = Collections.unmodifiableSet(toolIds);
    }

    public PracticeTools add(final ToolId toolId) {
        final Set<ToolId> toolIds = new HashSet<>(this.toolIds);
        toolIds.add(toolId);
        return new PracticeTools(this.id, toolIds);
    }

    public PracticeTools remove(final ToolId toolId) {
        final Set<ToolId> toolIds = new HashSet<>(this.toolIds);
        toolIds.remove(toolId);
        return new PracticeTools(this.id, toolIds);
    }
}

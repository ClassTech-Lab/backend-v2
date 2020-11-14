package com.classtechlab.manager.domain.model.tool;

public class Tool {
    private final ToolId id;
    private final ToolName name;

    public Tool(final ToolId id, final ToolName name) {
        this.id = id;
        this.name = name;
    }
}

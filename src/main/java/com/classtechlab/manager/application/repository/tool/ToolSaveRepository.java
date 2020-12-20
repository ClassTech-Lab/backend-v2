package com.classtechlab.manager.application.repository.tool;

import com.classtechlab.manager.domain.model.tool.Tool;

public interface ToolSaveRepository {
    void create(final Tool tool);

    void modify(final Tool tool);
}

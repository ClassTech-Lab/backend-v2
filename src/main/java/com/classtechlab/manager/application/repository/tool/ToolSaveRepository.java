package com.classtechlab.manager.application.repository.tool;

import com.classtechlab.manager.domain.model.tool.Tool;

public interface ToolSaveRepository {
    Tool save(final Tool tool);
}

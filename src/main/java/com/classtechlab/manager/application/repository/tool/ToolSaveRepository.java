package com.classtechlab.manager.application.repository.tool;

import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;

public interface ToolSaveRepository {
    ToolId save(final Tool tool);
}

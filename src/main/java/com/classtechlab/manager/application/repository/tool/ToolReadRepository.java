package com.classtechlab.manager.application.repository.tool;

import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;

public interface ToolReadRepository {
    Tool read(final ToolId id);
}

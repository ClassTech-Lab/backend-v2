package com.classtechlab.manager.application.repository.tool;

import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import com.classtechlab.manager.domain.type.item.Pack;

public interface ToolReadRepository {
    Pack<Tool> readAll();
    Tool read(final ToolId id);
}

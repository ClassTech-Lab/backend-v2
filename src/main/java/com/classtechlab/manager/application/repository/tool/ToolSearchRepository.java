package com.classtechlab.manager.application.repository.tool;

import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.type.item.Pack;
import com.classtechlab.manager.domain.type.name.Name;

public interface ToolSearchRepository {
    Pack<Tool> search(final Name name);
}

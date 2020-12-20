package com.classtechlab.manager.infrastructure.datasource.tool;

import com.classtechlab.manager.application.repository.tool.ToolReadRepository;
import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import org.springframework.stereotype.Repository;

@Repository
public class ToolReadDatasource implements ToolReadRepository {
    private final ToolMapper toolMapper;

    public ToolReadDatasource(final ToolMapper toolMapper) {
        this.toolMapper = toolMapper;
    }

    @Override
    public Tool read(final ToolId id) {
        return toolMapper.findBy(id);
    }
}

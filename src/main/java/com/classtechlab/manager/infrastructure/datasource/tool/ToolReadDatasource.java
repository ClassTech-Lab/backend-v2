package com.classtechlab.manager.infrastructure.datasource.tool;

import com.classtechlab.manager.application.repository.tool.ToolReadRepository;
import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import com.classtechlab.manager.domain.type.item.Pack;
import org.springframework.stereotype.Repository;

@Repository
public class ToolReadDatasource implements ToolReadRepository {
    private final ToolMapper toolMapper;

    public ToolReadDatasource(final ToolMapper toolMapper) {
        this.toolMapper = toolMapper;
    }

    @Override
    public Pack<Tool> readAll() {
        return new Pack<>(this.toolMapper.findAll());
    }

    @Override
    public Tool read(final ToolId id) {
        return this.toolMapper.findBy(id);
    }
}

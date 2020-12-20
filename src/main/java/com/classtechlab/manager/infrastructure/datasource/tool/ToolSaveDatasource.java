package com.classtechlab.manager.infrastructure.datasource.tool;

import com.classtechlab.manager.application.repository.tool.ToolSaveRepository;
import com.classtechlab.manager.domain.model.tool.Tool;
import org.springframework.stereotype.Repository;

@Repository
public class ToolSaveDatasource implements ToolSaveRepository {
    private final ToolMapper toolMapper;

    public ToolSaveDatasource(final ToolMapper toolMapper) {
        this.toolMapper = toolMapper;
    }

    @Override
    public Tool save(final Tool tool) {
        this.toolMapper.delete(tool);
        this.toolMapper.save(tool);
        return tool;
    }
}

package com.classtechlab.manager.application.service.tool;

import com.classtechlab.manager.application.repository.tool.ToolSaveRepository;
import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import org.springframework.stereotype.Service;

@Service
public class ToolSaveService {
    private final ToolSaveRepository toolSaveRepository;

    public ToolSaveService(final ToolSaveRepository toolSaveRepository) {
        this.toolSaveRepository = toolSaveRepository;
    }

    public ToolId create(final Tool tool) {
        this.toolSaveRepository.create(tool);
        return tool.id();
    }

    public boolean modify(final Tool tool) {
        return this.toolSaveRepository.modify(tool);
    }
}

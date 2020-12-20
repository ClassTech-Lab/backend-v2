package com.classtechlab.manager.application.service.tool;

import com.classtechlab.manager.application.repository.tool.ToolSaveRepository;
import com.classtechlab.manager.domain.model.tool.Tool;
import org.springframework.stereotype.Service;

@Service
public class ToolSaveService {
    private final ToolSaveRepository toolSaveRepository;

    public ToolSaveService(final ToolSaveRepository toolSaveRepository) {
        this.toolSaveRepository = toolSaveRepository;
    }

    public Tool save(final Tool tool) {
        return this.toolSaveRepository.save(tool);
    }
}

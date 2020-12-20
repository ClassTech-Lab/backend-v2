package com.classtechlab.manager.application.service.tool;

import com.classtechlab.manager.application.repository.tool.ToolReadRepository;
import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import org.springframework.stereotype.Service;

@Service
public class ToolReadService {
    private final ToolReadRepository toolReadRepository;

    public ToolReadService(final ToolReadRepository toolReadRepository) {
        this.toolReadRepository = toolReadRepository;
    }

    public Tool read(final ToolId id) {
        return this.toolReadRepository.read(id);
    }
}

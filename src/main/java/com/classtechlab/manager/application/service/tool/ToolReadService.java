package com.classtechlab.manager.application.service.tool;

import com.classtechlab.manager.application.repository.tool.ToolReadRepository;
import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import com.classtechlab.manager.domain.type.item.Pack;
import org.springframework.stereotype.Service;

@Service
public class ToolReadService {
    private final ToolReadRepository toolReadRepository;

    public ToolReadService(final ToolReadRepository toolReadRepository) {
        this.toolReadRepository = toolReadRepository;
    }

    public Pack<Tool> readAll() {
        return this.toolReadRepository.readAll();
    }

    public Tool read(final ToolId id) {
        return this.toolReadRepository.read(id);
    }
}

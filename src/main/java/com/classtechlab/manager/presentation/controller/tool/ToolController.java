package com.classtechlab.manager.presentation.controller.tool;

import com.classtechlab.manager.application.service.tool.ToolReadService;
import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import com.classtechlab.manager.presentation.controller.exception.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tool")
public class ToolController {
    private final ToolReadService toolReadService;

    public ToolController(final ToolReadService toolReadService) {
        this.toolReadService = toolReadService;
    }

    @GetMapping("{id}")
    public Tool.POJO tool(@PathVariable final ToolId id) {
        final Tool tool = this.toolReadService.read(id);
        if (tool == null) throw new NotFoundException();
        return tool.toPOJO();
    }
}

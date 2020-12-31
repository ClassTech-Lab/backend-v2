package com.classtechlab.manager.presentation.controller.tool;

import com.classtechlab.manager.application.service.tool.ToolReadService;
import com.classtechlab.manager.application.service.tool.ToolSaveService;
import com.classtechlab.manager.domain.exception.IllegalArgumentException;
import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import com.classtechlab.manager.presentation.controller.exception.BadRequestException;
import com.classtechlab.manager.presentation.controller.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tool")
public class ToolController {
    private final ToolReadService toolReadService;
    private final ToolSaveService toolSaveService;

    public ToolController(final ToolReadService toolReadService, final ToolSaveService toolSaveService) {
        this.toolReadService = toolReadService;
        this.toolSaveService = toolSaveService;
    }

    @GetMapping
    public List<Tool> get() {
        List<Tool> toolList = this.toolReadService.readAll().values(tool -> tool);
        return toolList;
    }

    @GetMapping("{id}")
    public Tool get(@PathVariable final ToolId id) {
        final Tool tool = this.toolReadService.read(id);
        if (tool == null) throw new NotFoundException();
        return tool;
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put(@PathVariable final ToolId id, @RequestBody final Tool.PlainObject toolPlainObject) {
        try {
            if (!this.toolSaveService.modify(toolPlainObject.toTool(id))) throw new NotFoundException();
        } catch (IllegalArgumentException e) {
            throw new BadRequestException(e);
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToolId post(@RequestBody final Tool.PlainObject toolPlainObject) {
        try {
            return this.toolSaveService.create(toolPlainObject.toTool());
        } catch (IllegalArgumentException e) {
            throw new BadRequestException(e);
        }
    }
}

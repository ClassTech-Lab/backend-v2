package com.classtechlab.manager.presentation.controller.tool;

import com.classtechlab.manager.application.service.tool.ToolReadService;
import com.classtechlab.manager.application.service.tool.ToolSaveService;
import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import com.classtechlab.manager.domain.type.item.Pack;
import com.classtechlab.manager.presentation.controller.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public Pack<Tool> get() {
        return this.toolReadService.readAll();
    }

    @GetMapping("{id}")
    public Tool get(@PathVariable final ToolId id) {
        final Tool tool = this.toolReadService.read(id);
        if (tool == null) throw new NotFoundException();
        return tool;
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put(@PathVariable final ToolId id, @RequestBody final Tool tool) {
        if (!this.toolSaveService.modify(tool.copy(id))) throw new NotFoundException();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToolId post(@RequestBody final Tool tool) {
        return this.toolSaveService.create(tool.copy());
    }
}

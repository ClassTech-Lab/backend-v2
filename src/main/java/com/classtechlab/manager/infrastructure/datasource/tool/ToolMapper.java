package com.classtechlab.manager.infrastructure.datasource.tool;

import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToolMapper {
    void insert(final Tool tool);

    List<Tool> findAll();

    Tool findBy(final ToolId id);

    void update(final Tool tool);

    void delete(final Tool tool);
}

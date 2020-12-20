package com.classtechlab.manager.infrastructure.datasource.tool;

import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ToolMapper {
    List<Tool> findAll();

    Tool findBy(@Param("id") final ToolId id);
}

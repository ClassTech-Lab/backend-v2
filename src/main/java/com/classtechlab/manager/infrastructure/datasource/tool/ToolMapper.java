package com.classtechlab.manager.infrastructure.datasource.tool;

import com.classtechlab.manager.domain.model.tool.Tool;
import com.classtechlab.manager.domain.model.tool.ToolId;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ToolMapper {
    Tool findBy(@Param("id") final ToolId id);
}

package com.classtechlab.manager.domain.model.school.managementBody;

/**
 * 運営母体
 */
public class ManagementBody {
    private final ManagementBodyId id;
    private final ManagementBodyName name;

    public ManagementBody(final ManagementBodyId id, final ManagementBodyName name) {
        this.id = id;
        this.name = name;
    }
}

package com.classtechlab.manager.domain.type.school;

import com.classtechlab.manager.domain.type.name.Name;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 学科
 */
@JsonSerialize(using = DepartmentSerializer.class)
public class Department {
    private final Name name;

    public Department(final Name name) {
        this.name = name;
    }

    private Name name() {
        return this.name;
    }

    static class POJO {
        private String name;

        static POJO parse(final Department department) {
            final POJO pojo = new POJO();
            pojo.name = department.name().string();
            return pojo;
        }
    }
}

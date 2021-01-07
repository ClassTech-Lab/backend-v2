package com.classtechlab.manager.infrastructure.datasource.school;

import com.classtechlab.manager.application.repository.school.DepartmentReadRepository;
import com.classtechlab.manager.domain.model.organization.Department;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentReadDatasource implements DepartmentReadRepository {
    private final Department[] departments = {};

    @Override
    public Department[] readAll() {
        return this.departments;
    }
}

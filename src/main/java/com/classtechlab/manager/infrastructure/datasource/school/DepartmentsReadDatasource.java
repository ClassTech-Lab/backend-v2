package com.classtechlab.manager.infrastructure.datasource.school;

import com.classtechlab.manager.application.repository.school.DepartmentsReadRepository;
import com.classtechlab.manager.domain.model.school.Departments;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentsReadDatasource implements DepartmentsReadRepository {
    private final Departments departments = new Departments();

    @Override
    public Departments readAll() {
        return this.departments;
    }
}

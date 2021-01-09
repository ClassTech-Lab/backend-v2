package com.classtechlab.manager.application.service.school;

import com.classtechlab.manager.application.repository.school.DepartmentsReadRepository;
import com.classtechlab.manager.domain.model.school.Departments;
import org.springframework.stereotype.Service;

@Service
public class DepartmentReadService {
    private final DepartmentsReadRepository departmentsReadRepository;

    public DepartmentReadService(final DepartmentsReadRepository departmentsReadRepository) {
        this.departmentsReadRepository = departmentsReadRepository;
    }

    public Departments readAll() {
        return this.departmentsReadRepository.readAll();
    }
}

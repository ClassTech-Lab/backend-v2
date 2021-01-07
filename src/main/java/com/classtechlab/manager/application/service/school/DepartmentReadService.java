package com.classtechlab.manager.application.service.school;

import com.classtechlab.manager.application.repository.school.DepartmentReadRepository;
import com.classtechlab.manager.domain.model.organization.Department;
import org.springframework.stereotype.Service;

@Service
public class DepartmentReadService {
    private final DepartmentReadRepository departmentReadRepository;

    public DepartmentReadService(final DepartmentReadRepository departmentReadRepository) {
        this.departmentReadRepository = departmentReadRepository;
    }

    public Department[] readAll() {
        return this.departmentReadRepository.readAll();
    }
}

package com.classtechlab.manager.application.repository.school;

import com.classtechlab.manager.domain.model.organization.Department;

public interface DepartmentReadRepository {
    Department[] readAll();
}

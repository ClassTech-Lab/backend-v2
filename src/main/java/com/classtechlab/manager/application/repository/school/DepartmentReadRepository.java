package com.classtechlab.manager.application.repository.school;

import com.classtechlab.manager.domain.type.school.Department;

public interface DepartmentReadRepository {
    Department[] readAll();
}

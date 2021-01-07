package com.classtechlab.manager.presentation.controller.school;

import com.classtechlab.manager.application.service.school.DepartmentReadService;
import com.classtechlab.manager.domain.model.organization.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("school/department")
public class DepartmentController {
    private final DepartmentReadService departmentReadService;

    public DepartmentController(final DepartmentReadService departmentReadService) {
        this.departmentReadService = departmentReadService;
    }

    @GetMapping
    public Department[] get() {
        return this.departmentReadService.readAll();
    }
}

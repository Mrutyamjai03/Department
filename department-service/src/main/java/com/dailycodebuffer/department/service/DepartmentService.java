package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository deportmentReposirty;


    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");

        return deportmentReposirty.save(department);
    }

    public Department findDepartmentId(Long departmentId) {
        log.info("Inside saveDepartment of DepartmentService");
        return deportmentReposirty.finByDepartmentId(departmentId);
    }
}
    
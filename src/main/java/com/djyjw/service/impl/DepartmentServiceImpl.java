package com.djyjw.service.impl;

import com.djyjw.dao.DepartmentMapper;
import com.djyjw.pojo.Department;
import com.djyjw.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public int insertDepartment(Department department) {

        departmentMapper.insert(department);
        return 0;
    }

    @Override
    public Department login(String name, String password) {
        return departmentMapper.login(name, password);
    }
}

package com.djyjw.service;

import com.djyjw.pojo.Department;

public interface DepartmentService {
    public int insertDepartment(Department department);
    public Department login(String name,String password);
}

package com.djyjw.service;

import com.djyjw.pojo.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;


    @Test
    public void insertDepartment() {
        Department department = new Department();
        department.setName("办公室");
        department.setPasswd("87133876");
        department.setType(1);
        departmentService.insertDepartment(department);
    }
}
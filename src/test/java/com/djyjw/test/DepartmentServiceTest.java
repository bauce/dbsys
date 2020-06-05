package com.djyjw.test;

import com.djyjw.pojo.Department;
import com.djyjw.service.DepartmentService;
import com.djyjw.utils.MD5Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/applicationContext-dao.xml", "classpath:spring/applicationContext-service.xml" })
public class DepartmentServiceTest {

    @Autowired
    DepartmentService departmentService;

    @Test
    public void insertDepartment() {
        Department department = new Department();
        department.setName("组织部");
        department.setPassword(MD5Utils.md5("8713s"));
        department.setType(1);
        departmentService.insertDepartment(department);
    }

    @Test
    public void test(){
        System.out.println(departmentService.login("组织部",MD5Utils.md5("8713s")));
    }
}
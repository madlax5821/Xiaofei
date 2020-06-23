package com.ascending.training.repository;

import com.ascending.training.init.AppInitializer;
import com.ascending.training.model.Department;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes= AppInitializer.class)
public class DepartmentDaoTest {
    @Autowired
    private DepartmentDao departmentDao;
    @Before
    public void setUp(){
        departmentDao = new DepartmentDaoImpl();
    }

    @Test
    public void getDepartmentsTest(){
        List<Department> departments = departmentDao.getDepartments();

    }

}


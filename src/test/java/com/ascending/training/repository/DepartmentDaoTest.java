package com.ascending.training.repository;

import com.ascending.training.model.Department;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class DepartmentDaoTest {
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


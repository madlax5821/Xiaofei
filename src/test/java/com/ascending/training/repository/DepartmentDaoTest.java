package com.ascending.training.repository;

import com.ascending.training.model.Department;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DepartmentDaoTest {
    @Test
    public void getDepartmentsTest(){
        DepartmentDao departmentJDBCDao = new DepartmentDao();
        List<Department> departmentList = departmentJDBCDao.getDepartments();
        assertEquals(4,departmentList.size());
    }
}

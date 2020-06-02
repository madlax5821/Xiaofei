package com.ascending.training.repository;

import com.ascending.training.model.Employee;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeeDaoTest {
    @Test
    public void getEmployeesTest(){
        EmployeeDao employeeJDBCDao = new EmployeeDao();
        List<Employee> employeeList = employeeJDBCDao.getEmployees();
        assertEquals(8,employeeList.size());
    }
}


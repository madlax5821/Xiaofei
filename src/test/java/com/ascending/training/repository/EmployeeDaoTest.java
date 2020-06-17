package com.ascending.training.repository;

import com.ascending.training.repository.EmployeeDao;
import com.ascending.training.model.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeeDaoTest {
    private EmployeeDao employeeDao;
    private Employee testObject;
    @Before
    public void setUp(){
        employeeDao = new EmployeeDaoImpl();
        //create employee
        testObject = new Employee();
        testObject.setEmail("zhang3@gmail.com");
        testObject.setFirstName("zhaang");
        testObject.setLastName("li4");
        employeeDao.save(testObject);
    }
    @After
    public void tearDown(){
        //delete employee
        employeeDao.delete(testObject);
    }
    @Test
    public void getEmployeesTest(){
        List<Employee> employeeList = employeeDao.getEmployees();
        assertEquals(1,employeeList.size());
    }
}


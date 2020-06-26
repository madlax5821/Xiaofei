package com.ascending.training.service;

import com.ascending.training.model.Employee;
import com.ascending.training.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    Employee save(Employee employee) {
        return employeeDao.save(employee);
    }


    List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    boolean delete(Employee emp) {
        return employeeDao.delete(emp);
    }

    Employee update(Employee employee) {
        return employeeDao.update(employee);
    }


    boolean delete(String empName) {
        return employeeDao.delete(empName);
    }

}

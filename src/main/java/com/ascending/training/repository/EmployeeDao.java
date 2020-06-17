package com.ascending.training.repository;

import com.ascending.training.model.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee save(Employee employee);
    List<Employee> getEmployees();
    boolean delete(Employee dep);
}

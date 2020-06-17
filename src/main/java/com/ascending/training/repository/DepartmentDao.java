package com.ascending.training.repository;

import com.ascending.training.model.Department;

import java.util.List;

public interface DepartmentDao {
    Department save(Department department);
    List<Department> getDepartments();
    boolean delete(Department dep);
    Department update(Department department);
    boolean delete(String deptName);

}

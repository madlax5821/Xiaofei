package com.ascending.training.service;

import com.ascending.training.model.Department;
import com.ascending.training.repository.DepartmentDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private DepartmentDao departmentDao;
    public Department save(Department department){return departmentDao.save(department);}
    public Department update(Department department){return departmentDao.update(department);}
    public List<Department> getDepartments() {return departmentDao.getDepartments();}
    public List<Department> getDepartmentsEager() {return departmentDao.getDepartmentsEager();}
}

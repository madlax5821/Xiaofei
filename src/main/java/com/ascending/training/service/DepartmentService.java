package com.ascending.training.service;

import com.ascending.training.model.Department;
import com.ascending.training.repository.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService {
    @Autowired
    DepartmentDao departmentDao;


    Department save(Department department){
        return departmentDao.save(department);
    }
    List<Department> getDepartments(){
        return departmentDao.getDepartments();
    };
    boolean delete(Department dep){
        return departmentDao.delete(dep);
    };
    Department update(Department department){
        return departmentDao.update(department);

    };
    boolean delete(String deptName){
        return departmentDao.delete(deptName);
    };
}

package com.ascending.training.model;

import java.sql.Date;

public class Employee {
    public Employee(){}
    private long Id;
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Date hiredDate;
    private long departmentId;

    public void setId(long id){

        this.Id = id;
    }
    public void setName(String name){

        this.name = name;
    }
    public void setFirstName(String firstName){

        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address){

        this.address = address;
    }
    public void setHiredDate(Date hiredDate){

        this.hiredDate = hiredDate;
    }
   // public void

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
}

package com.ascending.training.model;

import javax.jws.Oneway;
import javax.persistence.*;
import java.sql.Date;
import java.util.Set;
@Entity
@Table(name = "employees")

public class Employee {
    public Employee() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "hired_date")
    private Date hiredDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
    @OneToMany(mappedBy = "employee")
    private Set<Account> accounts;

    public void setId(long id) {

        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setHiredDate(Date hiredDate) {

        this.hiredDate = hiredDate;
    }
}

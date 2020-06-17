package com.ascending.training.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "departments")
public class Department {
    public Department(){}
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private long Id;



    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "location")
    private String location;
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;
    public void setId(long id){

        this.Id = id;
    }

    public long getId(){
        return Id;
    }
    public void setName(String name){

        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDescription(String description){

        this.description = description;
    }
    public String getDescription(){

        return description;
    }
    public void setLocation(String location){

        this.location = location;
    }
    public String getLocation(){

        return location;
    }
}

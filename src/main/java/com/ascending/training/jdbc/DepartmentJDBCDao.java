package com.ascending.training.jdbc;

import com.ascending.training.model.Department;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "departments")

public class DepartmentJDBCDao {
    static final String DBURL = "jdbc:postgresql://localhost:8888/Vehicles";
    static final String USER = "admin";
    static final String PASS = "password";

    public List<Department> getDepartments(){
        List<Department> departments = new ArrayList();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //STEP 2: Open a connection
            conn = DriverManager.getConnection(DBURL, USER, PASS);
            //STEP 3: Execute a query
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM departments";
            rs = stmt.executeQuery(sql);
            //STEP 4: Extract data from result set
            while(rs.next()) {
                //Retrieve by column name
                Long id  = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String location = rs.getString("location");
                //Fill the object
                Department department = new Department();
                department.setId(id);
                department.setName(name);
                department.setDescription(description);
                department.setLocation(location);
                departments.add(department);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            //STEP 6: finally block used to close resources
            try {
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch(SQLException se) {
                se.printStackTrace();
            }
        }
        return departments;
    }
    public static void main(String[] args){
        DepartmentJDBCDao deparmentJDBCDao = new DepartmentJDBCDao();
        System.out.println(deparmentJDBCDao.getDepartments());
    }
}


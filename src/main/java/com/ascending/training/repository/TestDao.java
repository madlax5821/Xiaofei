//package com.ascending.training.repository;
//
//import com.ascending.training.model.Department;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class TestDao {
//    static final String dbURL = System.getProperty("database.url");
//    static final String username = System.getProperty("database.user");
//    static final String password = System.getProperty("database.password");
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    public List<Department> getDepartments() {
//        List<Department> departments = new ArrayList<>();
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//
//        try {
//            conn = DriverManager.getConnection(dbURL, username, password);
//            stmt = conn.createStatement();
//
//            String sql = "SELECT * FROM departments";
//            rs = stmt.executeQuery(sql);
//
//            while (rs.next()) {
//                long id = rs.getLong("id");
//                String name = rs.getString("name");
//                String description = rs.getString("description");
//                String location = rs.getString("location");
//
//                Department department = new Department();
//                departments.add(department);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//                if (conn != null) {
//                    conn.close();
//                }
//                if (stmt != null) {
//                    stmt.close();
//                }
//            } catch (SQLException se) {
//                se.printStackTrace();
//            }
//        }
//
//        return departments;
//    }
//
//    public int save(Department department) {
//        int status = 0;
//        Connection conn = null;
//        PreparedStatement ps = null;
//
//        try {
//            conn = DriverManager.getConnection(dbURL, username, password);
//
//            String sql = "INSERT INTO departments (name, description, location) " +
//                    "VALUES (?, ?, ?)";
//
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, department.getName());
//            ps.setString(2, department.getDescription());
//            ps.setString(3, department.getLocation());
//
//            status = ps.executeUpdate();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//                if (ps != null) {
//                    ps.close();
//                }
//            } catch (SQLException se) {
//                se.printStackTrace();
//            }
//        }
//
//        return status;
//    }
//
//    public int update(String oldBookTitle, Book book) {
//        int status = 0;
//        Connection conn = null;
//        PreparedStatement ps = null;
//
//        try {
//            conn = DriverManager.getConnection(dbURL, username, password);
//
//            String sql = "UPDATE books SET title=?, category=?, rental_price=?, status=? WHERE title=?";
//
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, book.getTitle());
//            ps.setString(2, book.getCategory());
//            ps.setDouble(3, book.getRentalPrice());
//            ps.setBoolean(4, book.getStatus());
//            ps.setString(5, oldBookTitle);
//
//            status = ps.executeUpdate();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//                if (ps != null) {
//                    ps.close();
//                }
//            } catch (SQLException se) {
//                se.printStackTrace();
//            }
//        }
//
//        return status;
//    }
//
//    public int delete(String bookTitle) {
//        int status = 0;
//        Connection conn = null;
//        PreparedStatement ps = null;
//
//        try {
//            conn = DriverManager.getConnection(dbURL, username, password);
//
//            String sql = "DELETE FROM books WHERE title=?";
//
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, bookTitle);
//
//            status = ps.executeUpdate();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//                if (ps != null) {
//                    ps.close();
//                }
//            } catch (SQLException se) {
//                se.printStackTrace();
//            }
//        }
//
//        return status;
//    }
//
//    public static void main(String[] args) {
//        BookDao bookDao = new BookDao();
//        List<Book> books = bookDao.getBooks();
//
//        for (Book book : books) {
//            System.out.println(book.getTitle());
//        }
//    }
//}
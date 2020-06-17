package com.ascending.training.jdbc;

import com.ascending.training.model.Account;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
    static final String DBURL = "jdbc:postgresql://localhost:8888/Vehicles";
    static final String USER = "admin";
    static final String PASS = "password";

    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //STEP 2: Open a connection
            conn = DriverManager.getConnection(DBURL, USER, PASS);
            //STEP 3: Execute a query
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM accounts";
            rs = stmt.executeQuery(sql);
            //STEP 4: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                Long id = rs.getLong("id");
                String accountType = rs.getString("account_type");
                BigDecimal balance = rs.getBigDecimal("balance");
                Date createDate = rs.getDate("create_date");
                Long employeeId = rs.getLong("employee_id");
                //Fill the object
                Account account = new Account();
                account.setId(id);
                account.setAccountType(accountType);
                account.setBalance(balance);
                account.setCreateDate(createDate);
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //STEP 6: finally block used to close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return accounts;
    }
}
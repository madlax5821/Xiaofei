package com.ascending.training.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Account {
    public Account(){}
    private long id;
    private String accountType;
    private BigDecimal balance;
    private Date createDate;
    private long employeeId;

    public void setId(long id) {

        this.id = id;
    }
    public void setAccountType(String accountType){

        this.accountType = accountType;
    }
    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }
    public void setCreateDate(Date createDate){

        this.createDate = createDate;
    }
    public long getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(long employeeId){
        this.employeeId = employeeId;
    }
}

package com.ascending.training.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "accounts")
public class Account {
    public Account() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "balance")
    private BigDecimal balance;
    @Column(name = "created_date")
    private Date createDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;


    public void setId(long id) {

        this.id = id;
    }

    public void setAccountType(String accountType) {

        this.accountType = accountType;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCreateDate(Date createDate) {

        this.createDate = createDate;
    }

    public long getId() {
        return this.id;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public Date getCreateDate() {
        return this.createDate;
    }
}

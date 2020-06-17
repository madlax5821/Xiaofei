package com.ascending.training.repository;

import com.ascending.training.jdbc.AccountDao;
import com.ascending.training.model.Account;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AccountDaoTest {
    @Test
    public void getAccountsTest(){
        AccountDao accountJDBCDao = new AccountDao();
        List<Account> accountList = accountJDBCDao.getAccounts();
        assertEquals(4,accountList.size());
    }
}

package com.ascending.training.service;

import com.ascending.training.model.Account;
import com.ascending.training.model.Department;
import com.ascending.training.repository.AccountDao;
import com.ascending.training.repository.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public Account save(Account account) {
        return accountDao.save(account);
    }

    public Account update(Account account) {
        return accountDao.update(account);
    }

    public List<Account> getAccounts() {
        return accountDao.getAccounts();
    }

    public boolean delete(Account acc) {
        return accountDao.delete(acc);
    }

    public boolean delete(String accName) {
        return accountDao.delete(accName);
    }
//    public List<Department> getDepartmentsEager() {return departmentDao.getDepartmentsEager();}
}

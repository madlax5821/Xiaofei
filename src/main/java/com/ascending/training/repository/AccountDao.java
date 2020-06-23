package com.ascending.training.repository;

import com.ascending.training.model.Account;

import java.util.List;

public interface AccountDao {
    Account save(Account account);

    List<Account> getAccounts();

    boolean delete(Account acc);

    Account update(Account account);

    boolean delete(String accName);
}

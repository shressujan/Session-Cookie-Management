package com.example.sessioncookiemanagement.Service;

import com.example.sessioncookiemanagement.DAO.AccountDao;
import com.example.sessioncookiemanagement.Domain.Account;

public interface AccountService {

  void createAccount(AccountDao accountDao);
  Account getAccount(String accountID);
  void deleteAccount(String accountID);
}

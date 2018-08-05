package com.example.sessioncookiemanagement.Service;

import com.example.sessioncookiemanagement.DAO.AccountDao;
import com.example.sessioncookiemanagement.Domain.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

  @Override
  public void createAccount(AccountDao accountDao) {
  }

  @Override
  public Account getAccount(String accountID) {
    return null;
  }

  @Override
  public void deleteAccount(String accountID) {

  }
}

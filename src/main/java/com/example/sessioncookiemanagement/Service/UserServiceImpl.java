package com.example.sessioncookiemanagement.Service;

import com.example.sessioncookiemanagement.DAO.UserDao;
import com.example.sessioncookiemanagement.Domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Override
  public void createUser(UserDao userDao) {

  }

  @Override
  public User getUSer(String userID) {
    return null;
  }

  @Override
  public void deleteUser(String userID) {

  }
}

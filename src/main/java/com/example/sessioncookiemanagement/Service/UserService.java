package com.example.sessioncookiemanagement.Service;

import com.example.sessioncookiemanagement.DAO.UserDao;
import com.example.sessioncookiemanagement.Domain.User;

public interface UserService {

  void createUser(UserDao userDao);

  User getUSer(String userID);

  void deleteUser(String userID);

}

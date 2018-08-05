package com.example.sessioncookiemanagement.DAO;

import com.example.sessioncookiemanagement.Domain.Address;

import javax.swing.*;
import javax.validation.constraints.NotNull;

public class AccountDao {
  @NotNull
  private String email;

  @NotNull
  private String password;

  @NotNull
  private AddressDao addressDao;

  private JCheckBox check;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AddressDao getAddressDao() {
    return addressDao;
  }

  public void setAddressDao(AddressDao addressDao) {
    this.addressDao = addressDao;
  }

  public JCheckBox getCheck() {
    return check;
  }

  public void setCheck(JCheckBox check) {
    this.check = check;
  }

  @Override
  public String toString() {
    return "Account{" +
        "email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", address=" + addressDao +
        ", check=" + check +
        '}';
  }
}

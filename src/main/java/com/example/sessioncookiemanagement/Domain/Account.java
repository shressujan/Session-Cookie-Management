package com.example.sessioncookiemanagement.Domain;

import javax.swing.*;
import javax.validation.constraints.NotNull;

public class Account {

  @NotNull
  private String email;

  @NotNull
  private String password;

  @NotNull
  private Address address;

  @NotNull
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

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public JCheckBox isCheck() {
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
        ", address=" + address +
        ", check=" + check +
        '}';
  }
}

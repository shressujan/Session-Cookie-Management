package com.example.sessioncookiemanagement.Domain;

import javax.validation.constraints.NotNull;

public class Address {

  @NotNull
  private String address1;

  private String address2;

  @NotNull
  private String city;

  @NotNull
  private String state;

  @NotNull
  private Integer zip;

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Integer getZip() {
    return zip;
  }

  public void setZip(Integer zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "Address{" +
        "address1='" + address1 + '\'' +
        ", address2='" + address2 + '\'' +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", zip=" + zip +
        '}';
  }
}

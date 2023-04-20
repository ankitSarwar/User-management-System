package com.geekster.practice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToDo {

//    @JsonProperty("todoname")
    private int UserId;
    private String Name;
    private String UserName;
    private String Address;
    private String Phone_Number;

    public ToDo(int userId, String name, String userName, String address, String phone_Number) {
        UserId = userId;
        Name = name;
        UserName = userName;
        Address = address;
        Phone_Number = phone_Number;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }


}

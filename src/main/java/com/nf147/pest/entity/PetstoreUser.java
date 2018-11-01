package com.nf147.pest.entity;

public class PetstoreUser {
    private Integer user_id;

    private String user_username;

    private String user_firstName;

    private String user_lastName;

    private String user_email;

    private String user_password;

    private String user_phone;

    private Integer user_userStatus;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username == null ? null : user_username.trim();
    }

    public String getUser_firstName() {
        return user_firstName;
    }

    public void setUser_firstName(String user_firstName) {
        this.user_firstName = user_firstName == null ? null : user_firstName.trim();
    }

    public String getUser_lastName() {
        return user_lastName;
    }

    public void setUser_lastName(String user_lastName) {
        this.user_lastName = user_lastName == null ? null : user_lastName.trim();
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email == null ? null : user_email.trim();
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone == null ? null : user_phone.trim();
    }

    public Integer getUser_userStatus() {
        return user_userStatus;
    }

    public void setUser_userStatus(Integer user_userStatus) {
        this.user_userStatus = user_userStatus;
    }
}
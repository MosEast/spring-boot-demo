package com.login.pojo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

    private int id;
    
    @Length(min=6, message="密码长度不能少于六位!")
    @NotEmpty(message="密码不能为空!")
    private String password;

    @NotEmpty(message="用户名不能为空!")
    private String username;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

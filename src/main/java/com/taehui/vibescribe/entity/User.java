package com.taehui.vibescribe.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="users_test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String pass;

    private String email;

    private long age;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username =username;
    }
    public String getPass(){
        return this.pass;
    }
    public void setPass(String pass){
        this.pass =pass;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public long getAge(){
        return age;
    }

    public void setAge(long age){
        this.age = age;
    }

}

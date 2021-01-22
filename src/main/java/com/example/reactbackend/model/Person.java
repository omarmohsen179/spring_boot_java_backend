package com.example.reactbackend.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personid;
    @Column(name="personname")
    private String personname;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="bio")
    private String bio;
    @Column(name="email")
    private String email;
    @Column(name="dateofbirth")
    private Date dateofbirth;
    @Column(name="isLoggedIn")
    private Boolean isLoggedIn;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Long getPersonid() {
        return personid;
    }

    public void setPersonid(Long personid) {
        this.personid = personid;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Boolean getISLoggedin() {
        return isLoggedIn;
    }

    public void setIsLoggedin(Boolean loggedin) {
        isLoggedIn = loggedin;
    }
}

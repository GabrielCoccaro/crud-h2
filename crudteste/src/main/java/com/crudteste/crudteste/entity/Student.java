package com.crudteste.crudteste.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private long phoneNo;


    public Student() {
        super();
    }
    public Student(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
}

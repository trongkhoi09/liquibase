package com.spring.liquibasedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "com_id")
    private String id;
    private String name;
    private String address;
    private String CEO;
    private String job;

    public Company() {
    }

    public Company(String id, String name, String address, String CEO, String job) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.CEO = CEO;
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", CEO='" + CEO + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

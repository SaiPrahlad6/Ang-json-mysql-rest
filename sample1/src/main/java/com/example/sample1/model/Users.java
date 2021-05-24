package com.example.sample1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class Users {
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "roll_no")
    private int rollno;
    @Column(name = "salary")
    private int salary;
    @Id
    private int id;

    public String getFirst_name() {
        return firstname;
    }

    public void setFirst_name(String first_name) {
        this.firstname = first_name;
    }

    public int getRoll_no() {
        return rollno;
    }

    public void setRoll_no(int roll_no) {
        this.rollno = roll_no;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

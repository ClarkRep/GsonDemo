package com.example.clark.gsondemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;

import java.util.Date;

/**
 * Created by Clark on 2016/5/29.
 */
public class Student {

    @Expose
    private int id;

    @Expose
    private String name;

    @Expose
    @Since(2.0)
    private Date birthDay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }


    @Override
    public String toString() {

        return "Student{id=" + id + ",name=" + name + ",birthDay=" + birthDay + "}";
    }
}

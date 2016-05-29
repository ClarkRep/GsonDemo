package com.example.clark.gsondemo;

import java.util.Date;

/**
 * Created by Clark on 2016/5/29.
 */
public class Student {

    private int id;

    private String name;

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

        return "Student[id=" + id + ",name=" + name + ",birthDay=" + birthDay + "]";
    }
}

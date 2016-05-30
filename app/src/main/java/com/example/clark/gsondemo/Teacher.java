package com.example.clark.gsondemo;

/**
 * Created by Clark on 2016/5/30.
 */
public class Teacher {

    private String name;
    private String className;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Teacher[name:" + name + ",className:" + className + "]";
    }
}

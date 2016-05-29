package com.example.clark.gsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gsonTest1();

    }


    /**
     * Gson的基本使用
     */
    private void gsonTest1() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setBirthDay(new Date(System.currentTimeMillis()));
        student1.setName("张三");

        Gson gson = new Gson();
        //将简单的Bean转换成Json字符串
        String json = gson.toJson(student1);
        Log.i("haha", "简单Bean转换成Json：" + json);
        //将Json转换成简单Bean
        Student student = gson.fromJson(json, Student.class);
        Log.i("haha", "Json转换成简单Bean：" + student);

        List<Student> list = new ArrayList<>();
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("李四");
        student2.setBirthDay(new Date());

        Student student3 = new Student();
        student3.setId(3);
        student3.setName("王五");
        student3.setBirthDay(new Date());

        list.add(student1);
        list.add(student2);
        list.add(student3);


        //带泛型的List转换成Json
        String listJson = gson.toJson(list);
        Log.i("haha", "将带泛型的List转换成Json:" + listJson);
        //Json转换成带泛型的List
        List<Student> listFromJson = gson.fromJson(listJson, new TypeToken<List<Student>>() {
        }.getType());
        for (Student stu : listFromJson) {
            Log.i("haha", "将Json转换成List：" + stu);
        }
    }

}

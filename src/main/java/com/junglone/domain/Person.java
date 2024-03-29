package com.junglone.domain;

/**
 * Description:
 * Created by JungLone on 2016/8/29 17:30.
 */
public class Person {

    private String id;
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

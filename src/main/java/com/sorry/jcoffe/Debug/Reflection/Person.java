package com.sorry.jcoffe.Debug.Reflection;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("hello world!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

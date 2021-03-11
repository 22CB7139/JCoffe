package com.sorry.jcoffe.Debug.Reflection;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "kk";
        this.age = 18;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

}

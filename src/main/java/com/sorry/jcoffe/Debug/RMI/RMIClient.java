package com.sorry.jcoffe.Debug.RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient{
    public static void main(String[] args) throws Exception{
        //Registry registry = LocateRegistry.getRegistry("39.108.244.167",1099);
        //EXP exp = (EXP) registry.lookup("EXP");
        EXP exp = (EXP) Naming.lookup("rmi://:1099/exp");
        exp.Exploit("open /System/Applications/Calculator.app");
        System.out.println(exp);

    }
}

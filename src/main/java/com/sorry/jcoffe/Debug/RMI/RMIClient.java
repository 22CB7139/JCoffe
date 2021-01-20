package com.sorry.jcoffe.Debug.RMI;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient{
    public static void main(String[] args) throws IOException, NotBoundException{
        System.out.println("RMIClient ready!");
        Registry registry = LocateRegistry.getRegistry("192.168.31.151",1099);
        EXP exp = (EXP) registry.lookup("exp");
        System.out.println(exp.Exploit(""));

        /*
        EXP exp = (EXP) Naming.lookup("rmi://:1099/exp");
        exp.Exploit("open /System/Applications/Calculator.app");
        System.out.println(exp);
        */
    }
}

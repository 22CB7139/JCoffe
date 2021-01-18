package com.sorry.jcoffe.Debug.RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient{
    public static void main(String[] args) throws Exception{
        Registry registry = LocateRegistry.getRegistry(null);
        EXP exp = (EXP) registry.lookup("EXP");
        exp.Exploit("open /System/Applications/Calculator.app");

    }
}

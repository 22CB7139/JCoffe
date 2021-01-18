package com.sorry.jcoffe.Debug.RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {
    public static void main(String[] args) throws Exception{
        EXP exp = new EXPImpl();
        EXP stub = (EXP) UnicastRemoteObject.exportObject(exp,1099);
        LocateRegistry.createRegistry(1099);
        Registry registry = LocateRegistry.getRegistry();
        registry.bind("EXP",stub);
        System.out.println("EXP Ready");
    }
}

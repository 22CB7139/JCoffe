package com.sorry.jcoffe.Debug.RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(1099);
        EXP exp = new EXPImpl();
        registry.rebind("exp",exp);//rebind不抛出异常
        System.out.println("RMIServer ready");

    }
}

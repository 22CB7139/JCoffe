package com.sorry.jcoffe.Debug.RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) throws RemoteException {
        try{
            LocateRegistry.createRegistry(1099);
            LocateRegistry.getRegistry("localhost",1099).bind("EXP",new EXPImpl());
            System.out.println("EXP RMIServer Ready!");
        }catch (Exception e){
            //todo nothing
        }

    }
}

package com.sorry.jcoffe.Debug.RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements EXP{

    protected RMIServer() throws RemoteException {
    }

    @Override
    public void Exploit(String cmd) throws RemoteException {

    }

    public static void main(String[] args) throws RemoteException {
        try{
            LocateRegistry.createRegistry(1099);
            Naming.bind("rmi://:1099/exp",new EXPImpl());
            System.out.println("EXP RMIServer started.");
        }catch (Exception e){
            //todo nothing
        }

    }
}

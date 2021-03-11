package com.sorry.jcoffe.Debug.RMI;

import com.sorry.jcoffe.Debug.Serialization.EXP;

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Object extends UnicastRemoteObject implements ObjectInterface {
    protected Object() throws RemoteException {
        super();
    }

    /*
    public String Function(EXP exp) throws IOException,RemoteException{
        return exp.getClass().getName();
    }
    */


    public EXP Function(String cmd) throws RemoteException{
        EXP exp = new EXP();
        exp.setCommand(cmd);
        return exp;
    }


}

package com.sorry.jcoffe.Debug.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class EXPImpl extends UnicastRemoteObject implements EXP {

    protected EXPImpl() throws RemoteException {
        super();
    }

    @Override
    public void Exploit(String cmd) {
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("/bin/sh","-c",cmd);
            Scanner scanner = new Scanner(processBuilder.start().getInputStream().toString()).useDelimiter("\\A");
        }catch (Exception e){
            //todo nothing
        }
    }
}

package com.sorry.jcoffe.Debug.RMI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EXPImpl extends UnicastRemoteObject implements EXP {

    protected EXPImpl() throws RemoteException {}

    @Override
    public String Exploit(String cmd) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("/bin/sh","-c",cmd);
        Process process = processBuilder.start();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        return bufferedReader.readLine();
    }
}

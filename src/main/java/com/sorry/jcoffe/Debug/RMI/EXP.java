package com.sorry.jcoffe.Debug.RMI;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EXP extends Remote {
    public String Exploit(String cmd) throws IOException;

}

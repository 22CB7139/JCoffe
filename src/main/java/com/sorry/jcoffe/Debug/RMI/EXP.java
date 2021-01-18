package com.sorry.jcoffe.Debug.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EXP extends Remote {
    public void Exploit(String cmd) throws RemoteException;
}

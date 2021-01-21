package com.sorry.jcoffe.Debug.RMI;

import com.sorry.jcoffe.Debug.Serialization.EXP;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ObjectInterface extends Remote {
    public String Function(EXP exp) throws IOException,RemoteException;

}

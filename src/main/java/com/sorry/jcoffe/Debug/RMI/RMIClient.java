package com.sorry.jcoffe.Debug.RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient{
    public static void main(String[] args) throws Exception{
        /*
    Exception in thread "main" java.rmi.ConnectIOException: error during JRMP connection establishment; nested exception is:
        java.net.SocketException: Connection reset
        at sun.rmi.transport.tcp.TCPChannel.createConnection(TCPChannel.java:307)
        at sun.rmi.transport.tcp.TCPChannel.newConnection(TCPChannel.java:202)
        at sun.rmi.server.UnicastRef.invoke(UnicastRef.java:129)
        at java.rmi.server.RemoteObjectInvocationHandler.invokeRemoteMethod(RemoteObjectInvocationHandler.java:227)
        at java.rmi.server.RemoteObjectInvocationHandler.invoke(RemoteObjectInvocationHandler.java:179)
        at com.sun.proxy.$Proxy0.Exploit(Unknown Source)
        at com.sorry.jcoffe.Debug.RMI.RMIClient.main(RMIClient.java:10)
    Caused by: java.net.SocketException: Connection reset
        at java.net.SocketInputStream.read(SocketInputStream.java:210)
        at java.net.SocketInputStream.read(SocketInputStream.java:141)
        at java.io.BufferedInputStream.fill(BufferedInputStream.java:246)
        at java.io.BufferedInputStream.read(BufferedInputStream.java:265)
        at java.io.DataInputStream.readByte(DataInputStream.java:265)
        at sun.rmi.transport.tcp.TCPChannel.createConnection(TCPChannel.java:246)
        ... 6 more
         */
        Registry registry = LocateRegistry.getRegistry("39.108.244.167",1099);
        EXP exp = (EXP) registry.lookup("EXP");
        exp.Exploit("open /System/Applications/Calculator.app");

    }
}

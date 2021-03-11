package com.sorry.jcoffe.Debug.Serialization;


import java.io.*;
import java.rmi.RemoteException;

public class EXPSerialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Serialize("EXP.ser");
        UnSerialize("EXP.ser");
        return;
    }

    public static void Serialize(String targetname) throws IOException {
        EXP exp = new EXP();
        exp.setCommand("id");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(targetname)));
        oos.writeObject(exp);
        oos.close();
    }

    public static void UnSerialize(String targetname) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(targetname)));
        ois.readObject();
        ois.close();
    }



}

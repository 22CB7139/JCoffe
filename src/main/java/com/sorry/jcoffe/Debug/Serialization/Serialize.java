package com.sorry.jcoffe.Debug.Serialization;


import java.io.*;

public class Serialize {

    public static void main(String[] args) {
        /*
        sec120 test = new sec120();
        test.setLocation("HNUST");
        test.setMembers(new String[]{"zzq", "jjj","shm"});
        System.out.println(test);
        */
        try {
            //Serializesec120();
            Unserializesec120();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Seriliazesec120() throws Exception {
        sec120 test = new sec120();
        test.setLocation("HNUST");
        test.setMembers(new String[]{"zzq", "jjj","shm"});
        File file = new File("sec120.ser");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(test);
        System.out.println(oos);

    }
    public static void Unserializesec120() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("sec120.ser")));
        sec120 unsec120 = (sec120) ois.readObject();
        sec120 aaa = new sec120();
        System.out.println(unsec120.getLocation()+'\n'+unsec120.getMembers()[0]+unsec120.getMembers()[1]+unsec120.getMembers()[2]);
    }
}

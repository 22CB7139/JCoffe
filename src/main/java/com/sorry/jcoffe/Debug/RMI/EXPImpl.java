package com.sorry.jcoffe.Debug.RMI;

import java.util.Scanner;

public class EXPImpl implements EXP {

    @Override
    public void Exploit(String cmd) {
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("/bin/sh","-c",cmd);
            Scanner scanner = new Scanner(processBuilder.start().getInputStream().toString()).useDelimiter("\\A");
        }catch (Exception e){
            //todo nothing
        }
    }
}

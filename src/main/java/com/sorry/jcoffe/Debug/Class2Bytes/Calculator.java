package com.sorry.jcoffe.Debug.Class2Bytes;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    //definecalss取对象的时候会默认调用无参构造函数
    public Calculator(){
        java.lang.ProcessBuilder p;
        p = new java.lang.ProcessBuilder("/bin/sh","-c","open /System/Applications/Calculator.app");
        try {
            Scanner scanner = new Scanner(p.start().getInputStream().toString()).useDelimiter("\\A");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("define class successful!");
    }
    public void echo(){
        System.out.println("this will not be init");
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}

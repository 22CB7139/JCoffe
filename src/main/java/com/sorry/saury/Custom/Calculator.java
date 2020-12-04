package com.sorry.saury.Custom;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
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

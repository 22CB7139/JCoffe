package com.sorry.saury.Custom;

import java.io.*;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
        byte[] bs = getBytesByFile("/Users/0x22cb7139/programing/java/spring/spring/target/classes/com/sorry/saury/Test/Calculator.class");
        /*
        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i]+",");
        }
         */
        sun.misc.BASE64Encoder encoder;
        encoder = new sun.misc.BASE64Encoder();
        System.out.println(encoder.encode(bs));
    }
    public static byte[] getBytesByFile(String pathStr) {
        File file = new File(pathStr);
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            byte[] data = bos.toByteArray();
            bos.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

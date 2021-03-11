package com.sorry.jcoffe.Utils.JasyptUtil;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    private static final String PREFIX = "ENC(";
    private static final String SUFFIX = ")";
    private static final String JASYPT_ENCRYPTOR_PASSWORD = "retail_salt";
    private static BasicTextEncryptor textEncryptor = new BasicTextEncryptor();

    private JasyptUtil() {
    }

    public static boolean hasDecorate(String message) {
        return message.startsWith("ENC(") && message.endsWith(")");
    }

    public static String encryptDecorate(String message) {
        return "ENC(" + encrypt(message) + ")";
    }

    public static String decryptDecorate(String message) {
        message = message.substring("ENC(".length(), message.length() - ")".length());
        return decrypt(message);
    }

    public static String encrypt(String message) {
        String encrypt = textEncryptor.encrypt(message);
        return encrypt;
    }

    public static String decrypt(String message) {
        String decrypt = textEncryptor.decrypt(message);
        return decrypt;
    }

    static {
        textEncryptor.setPassword("retail_salt");
    }

    public static void main(String[] args) {
        System.out.println(JasyptUtil.decryptDecorate("ENC(Jdcn2P6/kO22rYwxGYYiZVQTDoxQPx7d)"));
    }
}

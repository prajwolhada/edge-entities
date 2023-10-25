package com.flsoft.bankxp.edge.entities.utl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Slf4j
public class AESEncryption {

    private static final String ENABLE_DB_ENCRYPTION = "ENABLE_BANKXP_DB_ENCRYPTION";
    private static final String ENCRYPTION_KEY = "BANKXP_DB_ENCRYPTION_KEY";
    private static final String INIT_VECTOR = "BANKXP_DB_INIT_VECTOR";

    private static String encryptionKey;
    private static String initVector;
    private static String enableEncryption;
    private static boolean doEncrypt;

    static {
        enableEncryption = System.getenv(ENABLE_DB_ENCRYPTION);
        encryptionKey = System.getenv(ENCRYPTION_KEY);
        initVector = System.getenv(INIT_VECTOR);

        doEncrypt = enableEncryption != null && enableEncryption.trim().equalsIgnoreCase("Y");
        log.info(ENABLE_DB_ENCRYPTION + " config : " + enableEncryption);
        log.info(ENABLE_DB_ENCRYPTION + " code : " + doEncrypt);
    }

    public static String encryptText(String value) {
        if (!doEncrypt) return value;

        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(value.getBytes());
            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public static String decryptText(String encrypted) {
        if (!doEncrypt) return encrypted;

        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
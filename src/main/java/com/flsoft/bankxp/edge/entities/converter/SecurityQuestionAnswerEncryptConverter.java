package com.flsoft.bankxp.edge.entities.converter;

import com.flsoft.bankxp.edge.entities.utl.MasterAESEncryption;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Converter
public class SecurityQuestionAnswerEncryptConverter implements AttributeConverter<String, String> {
    private static final String ENCRYPT_SECURITY_QUESTION_ANSWER = "ENCRYPT_SECURITY_QUESTION_ANSWER";

    private static String encrypt;
    private static boolean enableEncryption;

    static {
        encrypt = System.getProperty(ENCRYPT_SECURITY_QUESTION_ANSWER);
        enableEncryption = encrypt != null && encrypt.equalsIgnoreCase("Y");
        log.debug("encrypt : " + encrypt);
        log.debug("enableEncryption : " + enableEncryption);
    }

    public String convertToDatabaseColumn(String s) {
        if (enableEncryption) {
            return MasterAESEncryption.encryptText(s);
        }
        return s;
    }

    public String convertToEntityAttribute(String s) {
        if (enableEncryption) {
            return MasterAESEncryption.decryptText(s);
        }
        return s;
    }
}

package com.flsoft.bankxp.edge.entities.converter;

import com.flsoft.bankxp.edge.entities.utl.AESEncryption;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;


@Converter
public class EncryptConverter implements AttributeConverter<String, String> {
    public String convertToDatabaseColumn(String s) {
        return AESEncryption.encryptText(s);
    }

    public String convertToEntityAttribute(String s) {
        return AESEncryption.decryptText(s);
    }
}

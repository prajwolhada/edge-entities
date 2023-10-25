package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Prajwol Hada
 */
@Getter
@Setter
@Entity
@Table(name = "NQR_VALIDATION")
public class NQRValidation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date RecordedDate;
    @OneToOne
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    private CustomerLogin customerLogin;
    @Column(name = "INSTRUCTION_ID")
    private String instructionId;
    @Column(name = "QR", columnDefinition = "TEXT")
    private String qr;
    @Column(name = "TOKEN", columnDefinition = "TEXT")
    private String token;
    @Column(name = "VALIDATION_TRACE_ID")
    private String validationTraceId;
    @Column(name = "QR_TYPE", length = 10)
    private String qrType;
    @Column(name = "ACQUIRER_ID")
    private String acquirerId;
    @Column(name = "ACQUIRER_COUNTRY_CODE")
    private String acquirerCountryCode;
    @Column(name = "MERCHANT_PAN")
    private String merchantPan;
    @Column(name = "MERCHANT_CATEGORY_CODE")
    private Integer merchantCategoryCode;
    @Column(name = "MERCHANT_NAME")
    private String merchantName;
    @Column(name = "MERCHANT_CITY")
    private String merchantCity;
    @Column(name = "MERCHANT_COUNTRY_CODE")
    private String merchantCountryCode;
    @Column(name = "MERCHANT_BILL_NO")
    private String merchantBillNo;
    @Column(name = "MERCHANT_TXN_REF")
    private String merchantTxnRef;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "TRANSACTION_FEE")
    private Double transactionFee;
    @Column(name = "INTERCHANGE_FEE")
    private Double interchangeFee;
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;
    @Column(name = "TERMINAL")
    private String terminal;
    @Column(name = "ENC_KEY_SERIAL")
    private String encKeySerial;
    @Column(name = "NETWORK")
    private String network;
    @Column(name = "RESPONSE_CODE")
    private String responseCode;
    @Column(name = "SUCCESS")
    private char success;
    @Column(name = "QR_VENDOR")
    private String qrVendor;
}

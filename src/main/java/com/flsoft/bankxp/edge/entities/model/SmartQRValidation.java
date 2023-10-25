package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "SMART_QR_VALIDATION")
public class SmartQRValidation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date RecordedDate;

    @Column(name = "SCAN_ID")
    private String scanId;
    @Column(name = "QR", columnDefinition = "TEXT")
    private String qr;
    @Column(name = "QR_TYPE", length = 10)
    private String qrType;
    @Column(name = "MERCHANT_CATEGORY_CODE")
    private String merchantCategoryCode;
    @Column(name = "MERCHANT_NAME")
    private String merchantName;
    @Column(name = "MERCHANT_CITY")
    private String merchantCity;
    @Column(name = "MERCHANT_COUNTRY_CODE")
    private String merchantCountryCode;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "CHARGE_TYPE")
    private String chargeType;
    @Column(name = "CHARGE_AMOUNT")
    private Double chargeAmount;
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;
    @Column(name = "RESPONSE_CODE")
    private String responseCode;
    @Column(name = "SUCCESS")
    private char success;
    @Column(name = "QR_PAYMENT_SCAN_ID")
    private Long qrPaymentScanId;
    @OneToOne
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    private CustomerLogin customerLogin;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "CUSTOMER_EMAIL")
    private String customerEmail;
}
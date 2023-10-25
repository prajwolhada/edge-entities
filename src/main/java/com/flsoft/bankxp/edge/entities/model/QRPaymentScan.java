package com.flsoft.bankxp.edge.entities.model;


import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "QR_PAYMENT_SCAN")
public class QRPaymentScan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date RecordedDate;
    @Column(name = "SCAN_ID")
    private String scanId;
    @Column(name = "QR_PROVIDER")
    private String qrProvider;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "QR_TYPE")
    private String qrType;
    @Column(name = "QR", columnDefinition = "TEXT")
    private String qr;
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Column(name = "TOKEN", columnDefinition = "TEXT")
    private String token;
    @OneToOne
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    private CustomerLogin customerLogin;
    @Column(name = "QR_MERCHANT_CATEGORY_CODE")
    private String qrMerchantCategoryCode;
    @Column(name = "QR_MERCHANT_NAME")
    private String qrMerchantName;
}
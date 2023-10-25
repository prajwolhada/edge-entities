package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Dilip Mandal
 */

@Getter
@Setter
@Entity
@Table(name = "TAPNPAY_LINK_LOG")
public class TapnpayLinkLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "TOKEN")
    private String token;
    @Column(name = "TOTP_SECRET_KEY")
    private String totpSecretKey;
    @Column(name = "PUBLIC_KEY")
    private String publicKey;
    @Column(name = "MAX_TXN_AMOUNT")
    private String maxTxnAmount;
    @Column(name = "SERVICE")
    private String service;
    @Column(name = "EXPIRY_DATE")
    private String expiryDate;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @OneToOne
    @JoinColumn(name = "TAPNPAY_LINK_REQUEST_ID", referencedColumnName = "ID")
    private TapnpayLinkRequest tapnpayLinkRequest;
}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "NPS_WALLET_VALIDATION_DETAIL")
public class NPSWalletValidationDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", precision = 19, scale = 0)
    private Long id;

    @Column(name = "WALLET_ACCOUNT_NUMBER")
    private String walletAccountNumber;

    @Column(name = "WALLET_NAME")
    private String walletName;

    @Column(name = "WALLET_CODE")
    private String walletCode;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

    @Column(name = "RESPONSE_CODE")
    private String responseCode;

    @Column(name = "RESPONSE_DESCRIPTION")
    private String respDesc;
}
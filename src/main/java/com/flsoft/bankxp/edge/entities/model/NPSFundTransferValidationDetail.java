package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "NPS_FUND_TRANSFER_VALIDATION_DETAIL")
public class NPSFundTransferValidationDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", precision = 19, scale = 0)
    private Long id;

    @Column(name = "TO_ACCOUNT")
    private String toAccount;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "IS_MOBILE")
    private String isMobile;

    @Column(name = "BANK_CODE")
    private String bankCode;

    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

    @Column(name = "RESPONSE_CODE")
    private String responseCode;

    @Column(name = "RESPONSE_DESCRIPTION")
    private String respDesc;
}
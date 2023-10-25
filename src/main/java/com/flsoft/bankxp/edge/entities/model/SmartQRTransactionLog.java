package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

/**
 * @author Richa Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "SMART_QR_TRANSACTION_LOG")
public class SmartQRTransactionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "FROM_ACCOUNT")
    private String fromAccount;

    @Column(name = "TO_ACCOUNT")
    private String toAccount;

    @Column(name = "TXN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnDate;

    @Column(name = "TXN_CODE")
    private String txnCode;

    @Column(name = "TXN_AMOUNT")
    private String txnAmount;

    @Column(name = "TXN_STATUS")
    private String txnStatus;

    @Column(name = "SMART_QR_PAYMENT_ID")
    private Long smartQRPaymentId;

    @Column(name = "STAN_ID")
    private String stanId;

    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

    @Column(name = "RESPONSE_CODE")
    private String responseCode;

    @Column(name = "TXN_DESCRIPTION")
    private String txnDescription;

    @Column(name = "TRANSACTION_ID")
    private String transactionId;

    @Column(name = "TXN_TYPE")
    private String txnType;
}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Richa Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "NPI_PAYMENT")
public class NPIPayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date RecordedDate;

    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    @OneToOne
    @JoinColumn(name = "NPI_VALIDATION", referencedColumnName = "ID")
    private NPIValidation npiValidation;

    @OneToOne
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    private CustomerLogin customerLogin;

    @Column(name = "NPI_TRANSACTION_ID")
    private String npiTransactionId;

    @Column(name = "NPI_BATCH_ID")
    private String npiBatchId;

    @Column(name = "DEBTOR_ACCOUNT_ID")
    private String debtorAccountID;

    @Column(name = "DEBTOR_BRANCH")
    private String debtorBranch;

    @Column(name = "DEBTOR_AGENT")
    private String debtorAgent;

    @Column(name = "AMOUNT")
    private String amount;

    @Column(name = "TOKEN", columnDefinition = "TEXT")
    private String token;

    @Column(name = "DEBIT_STATUS")
    private String debitStatus;

    @Column(name = "CREDIT_STATUS")
    private String creditStatus;

    @Column(name = "RESPONSE_CODE")
    private String responseCode;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "STATUS_CODE", length = 5)
    private String statusCode;

    @Column(name = "PAYMENT_TYPE")
    private String paymentType;

    @Column(name = "REMARKS")
    private String remarks;
}

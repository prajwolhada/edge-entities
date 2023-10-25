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
@Table(name = "NQR_PAYMENT")
public class NQRPayment implements Serializable {

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
    @Column(name = "NQR_TXN_ID")
    private String nqrTxnId;
    @Column(name = "NPI_BATCH_ID")
    private Integer npiBatchId;
    @Column(name = "NPI_TXN_ID")
    private Integer npiTxnId;
    @OneToOne
    @JoinColumn(name = "REQUEST_INFO_ID", referencedColumnName = "ID")
    private RequestInfo requestInfo;
    @OneToOne
    @JoinColumn(name = "NQR_VALIDATION_ID", referencedColumnName = "ID")
    private NQRValidation nqrValidation;
    @Column(name = "MERCHANT_PAN")
    private String merchantPan;
    @Column(name = "PAYER_PAN_ID")
    private String payerPanId;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "INTERCHANGE_FEE")
    private Double interchangeFee;
    @Column(name = "TRANSACTION_FEE")
    private Double transactionFee;
    @Column(name = "DEBTOR_ACCOUNT")
    private String debtorAccount;
    @Column(name = "DEBTOR_AGENT")
    private String debtorAgent;
    @Column(name = "DEBTOR_AGENT_BRANCH")
    private String debtorAgentBranch;
    @Column(name = "ENC_KEY_SERIAL")
    private String encSerialKey;
    @Column(name = "TOKEN", columnDefinition = "TEXT")
    private String token;
    @Column(name = "ISSUER_ID")
    private String issuerId;
    @Column(name = "NARRATION")
    private String narration;
    @Column(name = "ADDITIONAL_FIELD1")
    private String additionalField1;
    @Column(name = "ADDITIONAL_FIELD2")
    private String additionalField2;
    @Column(name = "ADDITIONAL_FIELD10")
    private String additionalField10;
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
}

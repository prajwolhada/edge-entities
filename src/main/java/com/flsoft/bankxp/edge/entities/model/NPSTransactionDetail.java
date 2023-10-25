package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author srijan
 */
@Getter
@Setter
@Entity
@Table(name = "NPS_TRANSACTION_DETAIL", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"REQUEST_INFO_ID"})})
public class NPSTransactionDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", precision = 19, scale = 0)
    private Long id;

    @Column(name = "FROM_ACCOUNT")
    private String fromAccount;

    @Column(name = "TO_ACCOUNT")
    private String toAccount;

    @Column(name = "IS_MOBILE")
    private String isMobile;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "BANK_CODE")
    private String bankCode;

    @Column(name = "CURRENCY_CODE")
    private String currencyCode;

    @Column(name = "TXN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnDate;

    @Column(name = "RESPONSE_CODE")
    private String responseCode;

    @Column(name = "RESPONSE_DESCRIPTION")
    private String respDesc;

    @Column(name = "TRACE_ID")
    private String traceId;

    @Column(name = "TRANSACTION_ID")
    private String transactionId;

    @Column(name = "MERCHANT_TRANSACTION_ID")
    private String merchantTransactionId;

    @Column(name = "MERCHANT_PROCESS_ID")
    private String merchantProcessId;

    @JoinColumn(name = "REQUEST_INFO_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private RequestInfo requestInfo;

    @Column(name = "RESPONSE_STATUS")
    private Integer responseStatus;

}
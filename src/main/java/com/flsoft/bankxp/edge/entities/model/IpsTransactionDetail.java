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
@Table(name = "IPS_TRANSACTION_DETAIL", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"REQUEST_INFO_ID"})})
public class IpsTransactionDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", precision = 19, scale = 0)
    private Long id;

    @Basic(optional = false)
    @Column(name = "FROM_ACCOUNT")
    private String fromAccount;

    @Basic(optional = false)
    @Column(name = "TO_ACCOUNT")
    private String toAccount;

    @Column(name = "BANK_CODE")
    private String bankCode;

    @Column(name = "TXN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnDate;

    @Column(name = "RESPONSE_CODE")
    private String responseCode;
    @Column(name = "RESPONSE_DESCRIPTION")
    private String respDesc;

    @Column(name = "TRACE_ID")
    private String traceId;

    @JoinColumn(name = "REQUEST_INFO_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private RequestInfo requestInfo;

    @Column(name = "RESPONSE_STATUS")
    private Integer responseStatus;

    @Column(name = "RECEIVER_NAME")
    private String receiverName;

    @Column(name = "AMOUNT")
    private String amount;
}

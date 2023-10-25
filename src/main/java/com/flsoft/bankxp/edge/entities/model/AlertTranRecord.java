package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "ALERT_TRAN_RECORD")
public class AlertTranRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACCOUNT_NUMBER", length = 20)
    private String accountNumber;
    @Column(name = "TRACE_ID", length = 50)
    private Long traceId;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "TRAN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tranDate;
    @Column(name = "TRAN_TYPE", length = 3)
    private String tranType;
    @Basic(optional = false)
    @Column(name = "CHANNEL", length = 20)
    private String channel;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "BRANCH_CODE", nullable = false, length = 20)
    private String branchCode;
    @Column(name = "CURRENCY_CODE", length = 10)
    private String currencyCode;
    @Column(name = "MOBILE_NUMBER", length = 10)
    private String mobileNumber;
    @Column(name = "CUSTOMER_NAME", length = 200)
    private String customerName;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "PROCESSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedDate;
    @Column(name = "PROCESS_STATUS", length = 15)
    private String processStatus;
    @Column(name = "CONFIRMED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date confirmedDate;
    @Column(name = "MESSAGE_ID", length = 200)
    private String messageId;
    @Column(name = "ALERT_TYPE")
    private String alertType;
    @Column(name = "GCM_PROCESSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gcmProcessedDate;
    @Column(name = "GCM_CONFIRMED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gcmConfirmedDate;
    @Column(name = "TO_TRANSFER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date toTransferDate;
    @Column(name = "CUSTOMER_ALERT_LANGUAGE", length = 10)
    private String customerAlertLanguage;

    public AlertTranRecord() {
    }

}

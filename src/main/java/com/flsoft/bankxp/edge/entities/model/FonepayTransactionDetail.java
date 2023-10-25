package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Kailash
 */
@Getter
@Setter
@Entity
@Table(name = "FONEPAY_TRANSACTION_DETAIL")
public class FonepayTransactionDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Basic(optional = true)
    @Column(name = "SERVICE_INFO_ID", nullable = true, length = 100)
    private String serviceInfoID;
    @Basic(optional = true)
    @Column(name = "TRANSACTION_URI", nullable = true, length = 100)
    private String transactionURI;
    @Column(name = "FONEPAY_STATUS", nullable = true, length = 255)
    private String fonepayStatus;
    @Basic(optional = true)
    @Column(name = "FONEPAY_RESPONSE_CODE", nullable = true, length = 100)
    private String fonepayResponseCode;
    @Basic(optional = true)
    @Column(name = "FONEPAY_RESPONSE_DESCRIPTION", nullable = true, length = 255)
    private String fonepayResponseDescription;
    @Basic(optional = true)
    @Column(name = "FONEPAY_SERVICE_CODE", nullable = true, length = 100)
    private String fonepayServiceCode;
    @Column(name = "FONEPAY_TRACE_ID", nullable = true, length = 100)
    private String fonepayTraceID;
    @Column(name = "FONEPAY_TRANSACTION_STATUS", nullable = true, length = 100)
    private String fonepayTransactionStatus;
    @Column(name = "FONEPAY_TRANSACTION_REMARKS", nullable = true, length = 100)
    private String fonepayTransactionRemarks;
    @Column(name = "MTI_NUMBER", nullable = true, length = 100)
    private String mtiNumber;
    @JoinColumn(name = "REQUEST_INFO_ID")
    @OneToOne()
    private RequestInfo requestInfo;
    @Column(name = "FONEPAY_CHARGE", nullable = true, precision = 17, scale = 2)
    private Double fonepayCharge;
    @Column(name = "FONEPAY_CHARGE_TYPE", nullable = true, length = 100)
    private String fonepayChargeType;
    @Column(name = "TXN_TRACE_ID", nullable = true, length = 100)
    private String txnTraceId;
    @Column(name = "RECONCILE_REMARKS", nullable = true, length = 255)
    private String remarks;
    @JoinColumn(name = "INITIATED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser initiatedBy;
    @Column(name = "INITIATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date initaitedDate;
    @Basic(optional = true)
    @Column(name = "TRANSACTION_STATUS_CHECKED", nullable = true, length = 255)
    private String transactionStatusChecked;
    @Column(name = "TRANSACTION_STATUS_CHECKED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionStatusCheckedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
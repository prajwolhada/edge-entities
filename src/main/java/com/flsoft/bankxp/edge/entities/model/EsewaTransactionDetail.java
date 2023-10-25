package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Krishna <krishna.pandey@f1soft.com>
 */
@Entity
@Table(name = "ESEWA_TRANSACTION_DETAIL")
@Getter
@Setter
public class EsewaTransactionDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "ESEWA_ID")
    private String esewaId;
    @Column(name = "VALIDATION_STATUS ") // (SUCCESS,FAILED)
    private String validationStatus;
    @Column(name = "VALIDATION_RESPONSE_CODE")
    private String validationRespCode;
    @Column(name = "VALIDATION_RESPONSE_DESC")
    private String validationRespDesc;
    @Column(name = "ORIGINATING_UNIQUE_ID")
    private String originatingUniqueId;
    @Column(name = "TRANSACTION_STATUS ") //  ( COMPLETE) – status whatever comes from middleware
    private String txnStatus;
    @Column(name = "TRANSACTION_RESPONSE_CODE")
    private String txnRespCode;
    @Column(name = "TRANSACTION_RESPONSE_DESC")
    private String txnRespDesc;
    @JoinColumn(name = "REQUEST_INFO_ID")
    @OneToOne()
    private RequestInfo requestInfo;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "TXN_INITIAITED_DATE ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnInitiatedDate;
    @Column(name = "RECONCILE_REMARKS")
    private String reconcileRemarks;
    @Column(name = "TRANSACTION_STATUS_CHECKED ") // (0 – initially after transaction done, 1 – after status check api called)
    private String txnStatusChecked;
    @Column(name = "TRANSACTION_STATUS_CHECKED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnStatusCheckedDate;

}

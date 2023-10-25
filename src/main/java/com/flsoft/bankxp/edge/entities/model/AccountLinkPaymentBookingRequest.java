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
@Table(name = "ACCOUNT_LINK_PAYMENT_REQUEST")
@Getter
@Setter
public class AccountLinkPaymentBookingRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "USERNAME", length = 50)
    private String username;
    @Column(name = "ACCOUNT_NUMBER", length = 50)
    private String accountNumber;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "REMARKS", length = 50)
    private String remarks;
    @Column(name = "REQUEST_ID", length = 50)
    private String requestId;
    @Basic(optional = false)
    @Column(name = "VALIDATION_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date validationDate;
    @Column(name = "VALIDATION_REASON", length = 50)
    private String validationReason;
    @Column(name = "RESULT_CODE", length = 50)
    private String resultCode;
    @Column(name = "VALIDATION_STATUS", length = 50)
    private String validationStatus;
    @Column(name = "PAYMENT_REMARKS", length = 50)
    private String paymentRemarks;
    @Column(name = "PAYMENT_STATUS", length = 50)
    private String paymentStatus;
    @Column(name = "MERCHANT_CODE")
    private String merchantCode;
    @Column(name = "MERCHANT_ID")
    private String merchantId;
    @Column(name = "REQUEST_INFO_ID")
    private String requestInfoId;
    @Column(name = "MCC")
    private String mcc;
    @Column(name = "BOOKING_ID")
    private String bookingId;
}

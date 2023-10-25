package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Aakash Thakur
 */
@Getter
@Setter
@Entity
@Table(name = "IMEPAY_PAYMENT_DETAIL")
public class ImepayPaymentDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "MOBILE_NUMBER", length = 20)
    private String mobileNumber;

    @Column(name = "AMOUNT", length = 20)
    private String amount;

    @Column(name = "STATUS", length = 20)
    private String status;

    @Column(name = "EXTRA_ID")
    private String extraId;

    @Column(name = "CLIENT_TXN_ID")
    private String clientTxnId;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "REQUEST_INFO_ID")
    private Long requestInfoId;

    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    @Column(name = "NONCE")
    private String nonce;

    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;

    @Column(name = "DEPOSIT_STATUS_CHECKED")
    // (100 – After Imepay Transaction is successful, 101 – After ImePay Transaction failed)
    private String depositStatusChecked;

    @Column(name = "DEPOSIT_STATUS_CHECKED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date depositStatusCheckedDate;
}

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
@Table(name = "KHALTI_PAYMENT_DETAIL")
public class KhaltiPaymentDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_ID", length = 20)
    private String khaltiUserId;

    @Column(name = "AMOUNT", length = 20)
    private String amount;

    @Column(name = "STATUS", length = 20)
    private String status;

    @Column(name = "REFERENCE_ID")
    private String referenceId;

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
    // (0 – After Khalti Transaction is successful, 1 – After Khalti Deposit Status Check is called)
    private String depositStatusChecked;

    @Column(name = "DEPOSIT_STATUS_CHECKED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date depositStatusCheckedDate;
}

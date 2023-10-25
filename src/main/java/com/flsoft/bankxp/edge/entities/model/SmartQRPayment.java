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
@Table(name = "SMART_QR_PAYMENT")
public class SmartQRPayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date RecordedDate;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "CHARGE_TYPE")
    private String chargeType;
    @Column(name = "CHARGE_AMOUNT")
    private Double chargeAmount;
    @Column(name = "DEBTOR_ACCOUNT")
    private String debtorAccount;
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "RESPONSE_CODE")
    private String responseCode;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "STATUS_CODE", length = 5)
    private String statusCode;
    @Column(name = "SCAN_ID")
    private String scanId;
    @OneToOne
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    private CustomerLogin customerLogin;
    @OneToOne
    @JoinColumn(name = "REQUEST_INFO_ID", referencedColumnName = "ID")
    private RequestInfo requestInfo;
    @Column(name = "CUSTOMER_REMARKS")
    private String customerRemarks;
}
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
@Table(name = "DISPUTE_LODGE")
public class DisputeLodge implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Basic(optional = false)
    @Column(name = "MOBILE_NUMBER")
    private String mobileNmber;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Basic(optional = false)
    @Column(name = "TXN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnDate;
    @Basic(optional = false)
    @Column(name = "DISPUTE_TYPE")
    private long disputeType;
    @Basic(optional = false)
    @Column(name = "TXN_AMOUNT")
    private double txnAmount;
    @Basic(optional = false)
    @Column(name = "REF_NUMBER", nullable = true)
    private String refNumber;
    @Basic(optional = false)
    @Column(name = "PRIORITY")
    private int priority;
    @Column(name = "REMARKS", nullable = true)
    private String remarks;
    @Column(name = "USER_REMARKS")
    private String userRemarks;
}

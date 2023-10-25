package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

/**
 * @author Sabrin Luitel <sabrin.luitel@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "SELF_REG_CASHBACK_RECORD")
public class SelfRegCashbackRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "PROFILE_ID")
    private Long profileId;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "STATUS")
    private int status;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CASHBACK_AMOUNT")
    private Double cashBackAmount;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "REQUEST_INFO_ID")
    private String requestInfoId;
}

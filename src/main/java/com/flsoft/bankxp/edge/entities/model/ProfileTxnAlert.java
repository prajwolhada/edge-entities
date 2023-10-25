package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "PROFILE_TXN_ALERT")
public class ProfileTxnAlert extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CREDIT_ALERT")
    private Character creditAlert;
    @Basic(optional = false)
    @Column(name = "DEBIT_ALERT")
    private Character debitAlert;
    @Column(name = "MIN_CREDIT_AMT", precision = 53)
    private Double minCreditAmt;
    @Column(name = "MIN_DEBIT_AMT", precision = 53)
    private Double minDebitAmt;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "SMS_LIMIT", length = 10)
    private Integer smsLimit;
    @JoinColumn(name = "PROFILE_FEATURE_ID")
    @OneToOne()
    private ProfileFeature profileFeature;

    public ProfileTxnAlert() {
    }

}
package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <krishna.pandey@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "MCC_MERCHANT_TRANSACTION")
public class MCCMerchantTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Profile profile;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "TXN_AMOUNT")
    private Double txnAmount;
    @JoinColumn(name = "FEATURE_ID")
    @ManyToOne()
    private Feature feature;
    @Column(name = "MCC")
    private String mcc;
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Merchant merchant;
    @Column(name = "TRANSACTION_COUNT")
    private Integer transactionCount;
}

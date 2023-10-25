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
@Table(name = "PROFILE_TXN_LIMIT")
public class ProfileTxnLimit extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "PROFILE_FEATURE_ID")
    @ManyToOne()
    private ProfileFeature profileFeature;
    @Basic(optional = false)
    @Column(name = "MAXIMUM_AMOUNT", nullable = false)
    private Double maximumAmount;
    @Basic(optional = false)
    @Column(name = "MAXIMUM_AMOUNT_PER_TRANSACTION", nullable = false)
    private Double maximumAmountPerTransaction;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_TYPE", nullable = false, length = 20)
    private String transactionType;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_COUNT", nullable = false)
    private Integer transactionCount;
    @Basic(optional = false)
    @Column(name = "MONTHLY_MAX_TXN_AMOUNT")
    private Double monthlyMaxmTxnAmoutPerFeature;
    @JoinColumn(name = "CHANNEL_ID")
    @ManyToOne()
    private Channel channel;

    public ProfileTxnLimit() {
    }
}

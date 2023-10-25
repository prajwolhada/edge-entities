package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "PROFILE_MAIN_TXN_LIMIT")
public class ProfileMainTxnLimit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;
    @Basic(optional = false)
    @Column(name = "MAXIMUM_AMOUNT", nullable = false)
    private Double maximumAmount;
    @Basic(optional = false)
    @Column(name = "MAXIMUM_AMOUNT_PER_TRANSACTION", nullable = false)
    private Double maximumAmountPerTransaction;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_COUNT", nullable = false)
    private Integer transactionCount;
    @Basic(optional = false)
    @Column(name = "MONTHLY_MAX_TXN_AMOUNT")
    private Double maxmMonthlyTransactionAmount;
    @Column(name = "YEARLY_MAX_TXN_AMOUNT")
    private Double maxmYearlyTransactionAmount;
    @JoinColumn(name = "CHANNEL_ID")
    @ManyToOne()
    private Channel channel;

    public ProfileMainTxnLimit() {
    }
}

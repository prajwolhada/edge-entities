package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Sudip Pradhan
 */
@Getter
@Setter
@Entity
@Table(name = "TRANSACTION_FEE_SLAB")
public class TransactionFeeSlab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "CHARGE")
    private Double charge;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CHARGES")
    private String charges;
    @JoinColumn(name = "TRANSACTION_FEE_GROUP_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private CustomerTransactionFeeGroup txnFeeGroup;
    @Column(name = "MAX_AMOUNT")
    private Double maxAmount;
    @Column(name = "MIN_AMOUNT")
    private Double minAmount;
}

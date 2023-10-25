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
@Table(name = "FIXED_DEPOSIT_TENURE")
public class FixedDepositTenure implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;
    @Column(name = "DURATION")
    private Integer duration;
    @Column(name = "MAXIMUM_AMOUNT")
    private Double maxAmount;
    @Column(name = "MINIMUM_AMOUNT")
    private Double minAmount;
    @Column(name = "INTEREST_RATE", nullable = true)
    private Double interestRate;
}

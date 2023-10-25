package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "PARTNER_COMMISSION_CALCULATION")
public class PartnerCommissionCalculation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "COMMISSION_ID", nullable = true)
    @ManyToOne()
    private CommissionCalculation commissionCalculation;
    @JoinColumn(name = "COMMISSION_SHARING_ID", nullable = true)
    @ManyToOne()
    private CommissionSharing commissionSharing;
    @Column(name = "COMMISSION", nullable = false)
    private BigDecimal calculatedCommission;
    @Column(name = "CALCULATED_COMMISSION_RATE", nullable = true, length = 10)
    private String calculatedCommissionRate;
    @Column(name = "CALCULATED_COMMISSION_TYPE", nullable = true, length = 1)
    private char calculatedCommissionType;

    public PartnerCommissionCalculation() {
    }

}
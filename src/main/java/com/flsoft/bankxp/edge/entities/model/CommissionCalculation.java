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
@Table(name = "COMMISSION_CALCULATION")
public class CommissionCalculation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "COMMISSION_INFORMATION_ID", nullable = true)
    @ManyToOne()
    private CommissionInformation commissionInformation;
    @Column(name = "COMMISSION_PAYABLE", nullable = false)
    private String commissionPayable;
    @Column(name = "AMOUNT", precision = 18, scale = 2, nullable = false)
    private BigDecimal amount;
    @Column(name = "TOTAL_COMMISSION", precision = 18, scale = 2, nullable = false)
    private BigDecimal totalCommission;
    @Column(name = "CALCULATED_COMMISSION_RATE", nullable = true, length = 10)
    private String calculatedCommissionRate;
    @Column(name = "CALCULATED_COMMISSION_TYPE", nullable = true, length = 1)
    private char calculatedCommissionType;
    @JoinColumn(name = "REQUEST_INFO_ID", nullable = true)
    @OneToOne()
    private RequestInfo requestInfo;
    @Column(name = "REAL_TIME_SETTLED", nullable = false, length = 1)
    private Character realTimeSettled;
    @JoinColumn(name = "CHARGE_REQUEST_ID", nullable = true)
    @OneToOne()
    private ChargeRequest chargeRequest;

    public CommissionCalculation() {
    }
}

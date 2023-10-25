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
@Table(name = "CHARGE_TYPE")
public class ChargeType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "NAME", length = 80)
    private String name;
    @Basic(optional = false)
    @Column(name = "TYPE", length = 2)
    private String type;
    @Basic(optional = false)
    @Column(name = "CODE", length = 10)
    private String code;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;
    @Column(name = "CHARGE_REMARKS", length = 30)
    private String chargeRemarks;
    @Column(name = "FAILURE_CODE", length = 20)
    private String failureCode;
    @Column(name = "FAILURE_REMARKS", length = 255)
    private String failureRemarks;
    @Column(name = "CHARGES", nullable = false)
    private Character charges;
    @Column(name = "CATEGORY")
    private String category;

    public ChargeType() {
    }

    public ChargeType(Long id) {
        this.id = id;
    }

}

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
@Table(name = "PROFILE_CHARGE")
public class ProfileCharge implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "CHARGE", precision = 18, scale = 2)
    private Double charge;
    @Basic(optional = false)
    @Column(name = "CODE", length = 10)
    private String code;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false)
    private Character active;
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;
    @JoinColumn(name = "CHARGE_TYPE_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ChargeType chargeType;

    public ProfileCharge() {
    }
}
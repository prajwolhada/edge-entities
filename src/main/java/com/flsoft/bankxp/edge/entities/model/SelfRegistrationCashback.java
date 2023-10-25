package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author Sabrin Luitel <sabrin.luitel@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "SELF_REGISTRATION_CASHBACK")
public class SelfRegistrationCashback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "PROFILE_ID")
    private Long profileId;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "ACTIVE")
    private char active;
}

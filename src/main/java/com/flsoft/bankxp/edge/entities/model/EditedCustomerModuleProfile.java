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
@Table(name = "EDITED_CUSTOMER_MODULE_PROFILE")
public class EditedCustomerModuleProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "CUSTOMER_ID", nullable = true)
    private Long customerId;
    @Column(name = "MODULE_ID", nullable = true)
    private Long moduleId;
    @Column(name = "PROFILE_ID", nullable = true)
    private Long profileId;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "CUSTOMER_MODULE_PROFILE_ID", nullable = true)
    private Long customerModuleProfileId;
    @JoinColumn(name = "EDITED_CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private EditedCustomer editedCustomer;
    @Column(name = "SETTLE_PROFILE_CHARGE", nullable = true)
    private Character settleProfileCharge;
    @Column(name = "IS_PROFILE_CHANGED", nullable = true)
    private Character isProfileChanged;
    @Column(name = "PROFILE_CHARGE_AMOUNT", precision = 17, scale = 2)
    private Double profileChargeAmount;
    @Column(name = "PROFILE_REMARKS", nullable = true, length = 255)
    private String profileRemarks;

    public EditedCustomerModuleProfile() {
    }
}
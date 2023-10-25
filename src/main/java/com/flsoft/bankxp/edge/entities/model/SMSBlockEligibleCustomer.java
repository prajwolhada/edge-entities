package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Richa Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "SMS_BLOCK_ELIGIBLE_CUSTOMER")
public class SMSBlockEligibleCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACTIVE", nullable = false, precision = 22)
    private Character active;
    @Column(name = "MOBILE_NUMBER", nullable = false, precision = 22)
    private String mobileNumber;

}

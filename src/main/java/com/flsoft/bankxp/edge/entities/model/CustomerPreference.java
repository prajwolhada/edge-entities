package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author Gaurav Regmi
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_PREFERENCE")
public class CustomerPreference {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "LANGUAGE")
    private String language;
    @Column(name = "PROMOTION")
    private String promotion;
}

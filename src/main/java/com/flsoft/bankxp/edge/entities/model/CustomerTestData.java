package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Administrator
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_TEST_DATA")
public class CustomerTestData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "TXN_PIN")
    private String txnPin;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
}
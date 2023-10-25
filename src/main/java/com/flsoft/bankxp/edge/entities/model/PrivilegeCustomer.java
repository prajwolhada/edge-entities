package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Dilip Mandal
 */

@Getter
@Setter
@Entity
@Table(name = "PRIVILEGE_CUSTOMER")
public class PrivilegeCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "ACCOUNT_GROUP")
    private String accountGroup;
    @Column(name = "RM_NAME")
    private String rmName;
    @Column(name = "RM_MOBILE")
    private String rmMobile;
    @Column(name = "RM_EMAIL")
    private String rmEmail;

}

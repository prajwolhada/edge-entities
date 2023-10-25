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
@Table(name = "ACCOUNT_TYPE")
public class AccountType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "TYPE", nullable = false, length = 50)
    private String type;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_TYPE_NAME", nullable = false, length = 100)
    private String accountTypeName;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private char active;
    @Column(name = "ALLOW_TXN", length = 1, nullable = false)
    private char allowTxn;
    @Column(name = "ALLOW_REQUEST", length = 1, nullable = false)
    private char allowRequest;
    @Column(name = "ALLOW_TXN_ALERT", length = 1, nullable = true)
    private char allowTxnAlert;
    @Column(name = "ALLOW_DEBIT_TXN", length = 1, nullable = true)
    private Character allowDebitTxn;
    @Column(name = "ALLOW_CREDIT_TXN", length = 1, nullable = true)
    private Character allowCreditTxn;
    @Column(name = "IS_CHARGE_FREE", length = 1)
    private Character isChargeFree;
    @Column(name = "ACCOUNT_CATEGORY", length = 250)
    private String accountCategory;
    @Column(name = "ALLOW_FIXED_DEPOSIT", length = 1)
    private Character allowFixedDeposit;
    @Column(name = "IS_REGISTRATION_CHARGE_FREE", length = 1)
    private Character isRegistrationChargeFree;
    @Column(name = "IS_PROFILE_CHARGE_FREE", length = 1)
    private Character isProfileChargeFree;
    @Column(name = "IS_RENEW_CHARGE_FREE", length = 1)
    private Character isRenewChargeFree;
    @Column(name = "IS_PASSWORD_CHARGE_FREE", length = 1)
    private Character isPasswordChargeFree;


    public AccountType() {
    }

    public AccountType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

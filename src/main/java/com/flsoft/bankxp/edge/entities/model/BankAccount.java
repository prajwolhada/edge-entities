package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "BANK_ACCOUNT")
public class BankAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 50)
    private String accountNumber;
    @Column(name = "TXN_ENABLED", nullable = true, length = 2)
    private Character txnEnabled;
    @Column(name = "ALERT_ENABLED", nullable = true, length = 2)
    private Character alertEnabled;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_ALIAS", nullable = false, length = 5)
    private String accountAlias;
    @Basic(optional = false)
    @Column(name = "IS_PRIMARY", nullable = false, length = 1)
    private char isPrimary;
    @Basic(optional = true)
    @Column(name = "IS_ACCOUNT_OWNER", nullable = true, length = 1)
    private char isAccountOwner;
    @Column(name = "ACCOUNT_OWNER_CBS_ID", length = 50)
    private String accountOwnerCBSId;
    @JoinColumn(name = "ACCOUNT_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private AccountType accountType;
    @Basic(optional = false)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private Customer customer;
    @JoinColumn(name = "BRANCH_ID")
    @ManyToOne(optional = false)
    private Branch branch;
    @Basic(optional = true)
    @Column(name = "CARD_NUMBER", nullable = true, length = 50)
    private String cardNumber;
    @Basic(optional = false)
    @Column(name = "ADDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @JoinColumn(name = "ADDED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private ApplicationUser addedBy;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private ApplicationUser lastModifiedBy;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "SERVICE_FLAG")
    private Character serviceFlag;
    @Column(name = "SERVICE_CODE", nullable = true, length = 5)
    private String serviceCode;
    @Column(name = "SERVICE_REMARKS", nullable = true, length = 80)
    private String serviceRemarks;
    @Column(name = "RENEW_DATE", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date renewDate;
    @Basic(optional = true)
    @Column(name = "EXPIRY_DATE", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Column(name = "SERVICE_BLOCK_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date serviceBlockDate;
    @Column(name = "IS_TRIAL_PERIOD", nullable = true, length = 1)
    private Character isTrialPeriod;
    @Column(name = "CURRENCY_CODE", nullable = true, length = 80)
    private String currencyCode;
    @Column(name = "REG_CLEARED", nullable = true, length = 1)
    private Character regCleared;

    @Column(name = "CHARGE_CODE", nullable = false, length = 10)
    private String chargeCode;

    @Column(name = "CHARGE_REMARKS", nullable = true, length = 255)
    private String chargeRemarks;
    @Column(name = "CHARGE_DEDUCT_DATE", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date chargeDeductDate;
    @Column(name = "ACCOUNT_HOLDER_NAME", nullable = false, length = 255)
    private String accountHolderName;
    @Column(name = "ACCOUNT_LABEL", nullable = true, length = 80)
    private String accountLabel;

    public BankAccount() {
    }

    public BankAccount(Long id) {
        this.id = id;
    }

    public BankAccount(Long id, String accountNumber, String accountAlias, char isPrimary) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountAlias = accountAlias;
        this.isPrimary = isPrimary;
    }

}
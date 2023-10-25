package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author root
 */
@Getter
@Setter
@Entity
@Table(name = "EDITED_CUSTOMER_BANK_ACCOUNT")
public class EditedCustomerBankAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACCOUNT_ALIAS", length = 5)
    private String accountAlias;
    @Column(name = "ACCOUNT_NUMBER", length = 50)
    private String accountNumber;
    @Basic(optional = false)
    @Column(name = "EDITED_CUSTOMER_ID", nullable = false, insertable = false, updatable = false)
    private Long editedCustomerId;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "IS_PRIMARY")
    private Character isPrimary;
    @Basic(optional = true)
    @Column(name = "IS_ACCOUNT_OWNER", nullable = true, length = 1)
    private char isAccountOwner;
    @Column(name = "ACCOUNT_OWNER_CBS_ID", length = 50)
    private String accountOwnerCBSId;
    @Column(name = "TXN_ENABLED")
    private Character txnEnabled;
    @Column(name = "ALERT_ENABLED")
    private Character alertEnabled;
    @Column(name = "TYPE", length = 2)
    private Character type;
    @Column(name = "BRANCH_ID", nullable = true)
    private Long branchId;
    @Column(name = "ACCOUNT_ID", nullable = true)
    private Long accountId;
    @Column(name = "ACCOUNT_TYPE_ID", nullable = true)
    private Long accountTypeId;
    @Basic(optional = true)
    @Column(name = "CARD_NUMBER", nullable = true, length = 50)
    private String cardNumber;
    @Basic(optional = true)
    @Column(name = "ADDED_DATE", nullable = true)
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
    @JoinColumn(name = "EDITED_CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private EditedCustomer editedCustomer;
    @Column(name = "IS_CHARGE_SETTLED", nullable = true)
    private Character isChargeSettled;
    @Column(name = "SETTLEMENT_CHARGE_AMOUNT", precision = 17, scale = 2)
    private Double settlementChargeAmount;
    @Column(name = "SETTLEMENT_REMARKS", nullable = true, length = 255)
    private String settlementRemarks;
    @Column(name = "CURRENCY_CODE", nullable = true, length = 80)
    private String currencyCode;
    @Column(name = "ACCOUNT_HOLDER_NAME", nullable = true, length = 255)
    private String accountHolderName;

    public EditedCustomerBankAccount() {
    }

    public EditedCustomerBankAccount(Long id) {
        this.id = id;
    }

}
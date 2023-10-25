package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Sandhya Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "CARD_ACCOUNT")
public class CardAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "CARD_ID", nullable = false, length = 500)
    private String cardId;
    @Column(name = "MASKED_CARD_NUMBER", nullable = false, length = 500)
    private String maskedCardNumber;
    @Column(name = "IS_PRIMARY", nullable = false, length = 1)
    private Character isPrimary;
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;
    @Column(name = "CURRENCY", nullable = false, length = 1)
    private String currency;
    @Column(name = "SERVICE_CODE", nullable = false, length = 10)
    private String serviceCode;
    @Column(name = "SERVICE_FLAG", nullable = false, length = 10)
    private Character serviceFlag;
    @Column(name = "TXN_ENABLED", nullable = false, length = 10)
    private Character txnEnabled;
    @JoinColumn(name = "BRANCH_ID")
    @ManyToOne(optional = false)
    private Branch branch;
    @Column(name = "CHARGE_REMARKS", nullable = false, length = 10)
    private String chargeRemarks;
    @Column(name = "CARD_ACCOUNT_NUMBER", nullable = true, length = 10)
    private String cardAccountNumber;
    @Column(name = "RENEW_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date renewDate;
    @Column(name = "EXPIRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @JoinColumn(name = "ADDED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private ApplicationUser addedBy;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @JoinColumn(name = "CARD_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private CardType cardType;
    @Basic(optional = false)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private Customer customer;

}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "EVOUCHER")
public class EVoucher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE", nullable = false)
    private String code;

    @Column(name = "CURRENCY_CODE", nullable = false)
    private String currencyCode;

    @Column(name = "DEPOSIT_MODE", nullable = false)
    private String depositMode;

    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;

    @Column(name = "ACCOUNT_NAME", nullable = false)
    private String accountName;
    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;
    @Column(name = "DEPOSITED_BY", nullable = false)
    private String depositedBy;
    @Column(name = "MOBILE_NUMBER", nullable = false)
    private String mobileNumber;

    @JoinColumn(name = "BRANCH_ID")
    @ManyToOne(optional = false)
    private Branch branch;

    @Column(name = "SOURCE")
    private String source;
    @Column(name = "PURPOSE", nullable = false)
    private String purpose;

    @Column(name = "STATUS", nullable = false)
    private String status;
    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "DEPOSIT_AMOUNT")
    private Double depositAmount;
    @Column(name = "DEPOSIT_AMOUNT_IN_WORD")
    private String depositAmountInWord;
    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private Double totalAmount;
    @Column(name = "RETURN_AMOUNT")
    private Double returnAmount;

    @Column(name = "DEPOSIT_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date depositDate;

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @JoinColumn(name = "APPLICATION_USER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser applicationUser;

    @OneToMany(mappedBy = "evoucher", fetch = FetchType.EAGER)
    private List<EVoucherActivity> eVoucherActivities;
    @OneToMany(mappedBy = "eVoucher", cascade = CascadeType.PERSIST)
    private List<EVoucherCashDeposit> cashDeposit;
    @OneToMany(mappedBy = "eVoucher", cascade = CascadeType.PERSIST)
    private List<EvoucherChequeDeposit> chequeDeposit;
    @OneToMany(mappedBy = "eVoucher", cascade = CascadeType.PERSIST)
    private List<EVoucherDocument> doucments;

}

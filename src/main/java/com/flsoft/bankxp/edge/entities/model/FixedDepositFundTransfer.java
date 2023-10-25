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
@Table(name = "FIXED_DEPOSIT_FUND_TRANSFER")
public class FixedDepositFundTransfer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "FROM_ACCOUNT", length = 80)
    private String fromAccount;
    @Column(name = "ACCOUNT_NAME", length = 80)
    private String accoutName;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @JoinColumn(name = "DEPOSIT_TENURE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private FixedDepositTenure tenure;
    @Column(name = "AMOUNT", precision = 17, scale = 2)
    private Double amount;
    @Column(name = "FIXED_DEPOSIT_TYPE_ID", length = 100)
    private Long fixedDepositTypeId;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private CustomerLogin customerLoginId;
    @Basic(optional = false)
    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;
    @Column(name = "EMAIL", length = 255)
    private String emailAddress;
    @Column(name = "STATUS", length = 255)
    private String status;
    @Column(name = "REMARKS", length = 255)
    private String remarks;
    @Basic(optional = false)
    @Column(name = "ADMIN_NOTIFIED_BRANCH", nullable = true)
    private Long adminNotifiedBranch;

    @Column(name = "DURATION")
    private Integer duration;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "RESPONSE_TEXT", length = 255)
    private String responseText;
    @Column(name = "TXN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnDate;
    @Basic(optional = false)
    @Column(name = "NOMINEE_DETAIL")
    private String nomineeDetail;
    @Column(name = "AUTO_RENEW")
    private Character autoRenew;
    @Column(name = "INTEREST_PAYMENT")
    private String interestPayment;
    @Column(name = "BRANCH_CODE")
    private String branchCode;
    @Column(name = "INTEREST_RATE")
    private Double interestRate;
}

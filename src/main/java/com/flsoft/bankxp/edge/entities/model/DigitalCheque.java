package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
@Table(name = "DIGITAL_CHEQUE")
public class DigitalCheque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "AMOUNT_STATUS")
    private String amountStatus;

    @Column(name = "CODE")
    private String code;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID", nullable = false)
    private CustomerLogin customerLogin;

    @Column(name = "CREATED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "ISSUED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;

    @Column(name = "EXPIRY_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;

    @Column(name = "ISSUE_TYPE", nullable = false, length = 50)
    private String issueType;

    @Column(name = "RECEIVER_NAME", nullable = false, length = 200)
    private String receiverName;

    @Column(name = "RECEIVER_MOBILE_NUMBER", nullable = false, length = 20)
    private String receiverMobileNumber;

    @Column(name = "AMOUNT", nullable = false)
    private Double amount;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;

    @Column(name = "BANK_ACCOUNT_ID", nullable = false)
    private Long bankAccountId;

    @Column(name = "SENDER_NAME", nullable = false)
    private String senderName;

    @Column(name = "REQUEST_INFO_ID")
    private String requestInfoId;

    @Column(name = "CHANNEL_ID")
    private Long channelId;

    @Column(name = "LAST_MODIFIED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "AMOUNT_IN_WORD")
    private String amountInWord;

    @OneToMany(mappedBy = "digitalCheque", fetch = FetchType.EAGER)
    private List<DigitalChequeCashOut> digitalChequeCashOuts;

    @OneToMany(mappedBy = "digitalCheque", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<DigitalChequeActivity> history;

    @OneToMany(mappedBy = "digitalCheque", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<DigitalChequeReversal> digitalChequeReversals;

    @JoinColumn(name = "APPLICATION_USER_ID", referencedColumnName = "ID")
    @ManyToOne()
    private ApplicationUser applicationUser;
}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Rashim Dhaubanjar
 */
@Getter
@Setter
@Entity
@Table(name = "CARD_REQUEST_LOG")
public class CardRequestLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "REQUEST_TYPE")
    private String requestType;
    @Column(name = "CARD_TYPE")
    private String cardType;
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;
    @Column(name = "REMARKS")
    private String remarks;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQUESTED_TIME")
    private Date requestedTime;
    @Column(name = "BRANCH_ID")
    private Long branchId;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "EXPIRY_DATE")
    private String expiryDate;
    @Column(name="STATUS")
    private String status;
    @ManyToOne
    @JoinColumn(name = "APPLICATION_USER_ID")
    private ApplicationUser modifiedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MODIFIED_DATE")
    private Date modifiedDate;
}

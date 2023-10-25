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
@Table(name = "VISA_CARD")
public class VisaCard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "REQUEST_TYPE")
    private String requestType;
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;
    @Column(name = "STATUS")
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQUESTED_TIME")
    private Date requestedTime;
    @Column(name = "BRANCH_ID")
    private String branchId;
    @Column(name = "REMARKS")
    private String remarks;
}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author rashim.dhaubanjar
 */
@Getter
@Setter
@Entity
@Table(name = "BULK_REGISTRATION_RECORD")
public class BulkRegistrationRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @Column(name = "BRANCH_CODE", nullable = false)
    private String branchCode;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;
    @Basic(optional = false)
    @Column(name = "MOBILE_NUMBER", length = 15)
    private String mobileNumber;
    @Column(name = "CBS_ID", length = 50)
    private String cbsId;
    @Column(name = "EMAIL_ADDRESS", length = 100)
    private String emailAddress;
    @Column(name = "CREATED_BY", length = 20)
    private Long createdBy;
    @Column(name = "PROFILE_ID", length = 20)
    private Long profileId;
    @Column(name = "STATUS", length = 1)
    private Integer status = 0;
    @Column(name = "REMARKS", length = 100)
    private String remarks;
    @Column(name = "CUSTOMER_NAME", length = 100)
    private String customerName;
    @Column(name = "ADDRESS", length = 100)
    private String address;
    @Column(name = "ACCOUNT_TYPE", length = 100)
    private String accountType;
    @Column(name = "GENDER", length = 2)
    private String gender;
    @Column(name = "CURRENCY_CODE", length = 10)
    private String currencyCode;
    @JoinColumn(name = "BATCH_REGISTRATION_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private BatchRegistration batchRegistration;
}

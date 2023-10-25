package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "SELF_REGISTRATION_INFORMATION")
public class SelfRegistrationInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_NUMBER", nullable = true, length = 225)
    private String accountNumber;
    @Column(name = "CBS_ID", nullable = true, length = 225)
    private String cbsId;
    @Column(name = "BRANCH_CODE", nullable = true, length = 225)
    private String branchCode;
    @Column(name = "ACCOUNT_TYPE", length = 225)
    private String accountType;
    @Column(name = "MOBILE_NUMBER", nullable = false, length = 225)
    private String mobileNumber;
    @Column(name = "PROFILE_ID", length = 225)
    private String profileId;
    @Column(name = "EMAIL_ADDRESS", length = 225)
    private String emailAddress;
    @Column(name = "GENDER", length = 225)
    private String gender;
    @Column(name = "CURRENCY_CODE", length = 225)
    private String currencyCode;
    @Column(name = "CUSTOMER_NAME", length = 225)
    private String customerName;
    @Column(name = "ADDRESS", length = 225)
    private String address;
    @Column(name = "DEBIT_CARD_NUMBER")
    private String debitCardNumber;
    @Column(name = "CITIZENSHIP_ID")
    private String citizenshipId;
    @Column(name = "DOB")
    private String dob;
    @JoinColumn(name = "CUSTOMER_REGISTRATION_HISTORY_ID", referencedColumnName = "ID")
    @OneToOne()
    private CustomerRegistrationHistory customerRegistrationHistory;
}

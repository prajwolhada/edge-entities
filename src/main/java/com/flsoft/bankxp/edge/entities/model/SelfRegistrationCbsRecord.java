package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author sandhya.pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "SELF_REGISTRATION_CBS_RECORD")
public class SelfRegistrationCbsRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 225)
    private String accountNumber;
    @Column(name = "CBS_ID", nullable = false, length = 225)
    private String cbsId;
    @Column(name = "BRANCH_CODE", nullable = false, length = 225)
    private String branchCode;
    @Column(name = "ACCOUNT_TYPE", nullable = true, length = 225)
    private String accountType;
    @Column(name = "MOBILE_NUMBER", nullable = false, length = 225)
    private String mobileNumber;
    @Column(name = "PROFILE_ID", nullable = true, length = 225)
    private String profileId;
    @Column(name = "EMAIL_ADDRESS", nullable = true, length = 225)
    private String emailAddress;
    @Column(name = "GENDER", nullable = true, length = 225)
    private String gender;
    @Column(name = "CURRENCY_CODE", nullable = true, length = 225)
    private String currencyCode;
    @Column(name = "CUSTOMER_NAME", nullable = true, length = 225)
    private String customerName;
    @Column(name = "ADDRESS", nullable = true, length = 225)
    private String address;
    @JoinColumn(name = "SELF_REGISTRATION_HISTORY_ID", referencedColumnName = "ID")
    @OneToOne()
    private SelfRegistrationHistory selfRegistrationHistory;

}

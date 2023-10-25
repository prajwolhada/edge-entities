package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Sandhya Pokhrel
 */
@Entity
@Table(name = "ACCOUNT_REGISTRATION_CBS_RECORD")
@Getter
@Setter
public class AccountRegistrationCbsRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 500)
    private String accountNumber;
    @Column(name = "ACCOUNT_TYPE", nullable = false, length = 500)
    private String accountType;
    @Column(name = "BRANCH_CODE", nullable = false, length = 500)
    private String branchCode;
    @Column(name = "CBS_ID", nullable = false, length = 500)
    private String cbsId;
    @Column(name = "CURRENCY_CODE", nullable = false, length = 500)
    private String currencyCode;
    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;
    @Column(name = "MIDDLE_NAME", length = 50)
    private String middleName;
    @Column(name = "LAST_NAME", length = 50)
    private String lastName;
    @Column(name = "CUSTOMER_NAME", length = 50)
    private String customerName;
    @Column(name = "PROFILE_ID", length = 50)
    private String profileId;

    @JoinColumn(name = "REGISTERED_ACCOUNT_HISTORY_ID", referencedColumnName = "ID")
    @OneToOne()
    private RegisteredAccountHistory registeredAccountHistory;

}

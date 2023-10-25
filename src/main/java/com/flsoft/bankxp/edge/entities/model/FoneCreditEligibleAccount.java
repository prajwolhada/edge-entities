package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Swaroop Tewari
 */
@Entity
@Table(name = "FONE_CREDIT_ELIGIBLE_ACCOUNT")
@NamedQueries({
        @NamedQuery(name = "FoneCreditEligibleAccount.findAll", query = "SELECT f FROM FoneCreditEligibleAccount f where f.active = 'Y'")
        , @NamedQuery(name = "FoneCreditEligibleAccount.findById", query = "SELECT f FROM FoneCreditEligibleAccount f WHERE f.id = :id and f.active = 'Y'")
        , @NamedQuery(name = "FoneCreditEligibleAccount.findByAccountNumber", query = "SELECT f FROM FoneCreditEligibleAccount f WHERE f.accountNumber = :accountNumber and f.active = 'Y'")
        , @NamedQuery(name = "FoneCreditEligibleAccount.findByCustomerId", query = "SELECT f FROM FoneCreditEligibleAccount f WHERE f.customerId = :customerId and f.active = 'Y'")})
@Getter
@Setter
public class FoneCreditEligibleAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "ID", nullable = true, precision = 22)
    private Long id;
    @Column(name = "CUSTOMER_ID", nullable = true)
    private long customerId;
    @Column(name = "ACCOUNT_NUMBER", nullable = true, length = 100)
    private String accountNumber;
    @Column(name = "MOBILE_NUMBER", nullable = true, length = 100)
    private String mobileNumber;
    @Column(name = "ACCOUNT_TYPE", nullable = true, length = 100)
    private String accountType;
    @Column(name = "ACCOUNT_BRANCH", nullable = true, length = 100)
    private String accountBranch;
    @Column(name = "ACCOUNT_HOLDER_NAME", nullable = true, length = 100)
    private String accountHolderName;
    @Column(name = "STATUS", nullable = true, length = 100)
    private String status;
    @Column(name = "ACTIVE", nullable = true, length = 1)
    private Character active;
    @Column(name = "LAST_MODIFIED_DATETIME", nullable = true)
    private Date lastModifiedDateTime;
    @Column(name = "ACCESS_TOKEN", nullable = true, length = 255)
    private String accessToken;
}

package com.flsoft.bankxp.edge.entities.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_LOGIN")
public class CustomerLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @Column(name = "USERNAME", nullable = false, length = 20)
    private String username;
    @Column(name = "PASSWORD", length = 200)
    private String password;
    @Column(name = "TXN_PASSWORD", length = 200)
    private String txnPassword;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "PASSWORD_FLAG")
    private String passwordFlag;
    @Column(name = "CUSTOMER_ID", insertable = false, updatable = false)
    private Long customerId;
    @Column(name = "CUSTOMER_DELETE")
    private Character customerDelete;
    @Column(name = "LATEST_CHANGED_USERNAME", nullable = true, length = 20)
    private String latestChangedUsername;

    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Customer customer;
    @JoinColumn(name = "APPLICATION_PATTERN_ID")
    @ManyToOne()
    private ApplicationPattern applicationPattern;
    @Column(name = "IS_INITIAL_PASSWORD", length = 1)
    private Character isInitialPassword;
    @Column(name = "IS_INITIAL_TXN_PASSWORD", length = 1)
    private Character isInitialTxnPassword;
    @Column(name = "LAST_LOGIN_PASSWORD_CHANGED", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginPasswordChanged;
    @Column(name = "LAST_TXN_PASSWORD_CHANGED", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastTxnPasswordChanged;
    @Column(name = "IS_PRIMARY")
    private Character isPrimary;

    @OneToMany(mappedBy = "customerLogin", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<LoginAccessChannel> loginAccessChannels;

    @Column(name = "LAST_FORGOT_PASSWORD_CHANGED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastForgotPasswordChanged;

    @JoinColumn(name = "ADDED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser addedBy;
    @Column(name = "ADDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;

    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser lastModifiedBy;

    @Column(name = "LAST_MODIFIED_DATE", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Column(name = "HAS_TERMS_ACCEPTED", length = 1, nullable = true)
    private Character hasTermsAccepted;

    @Column(name = "ACTIVATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activationDate;

    @Column(name = "FIRST_LOGIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstLoginDate;

    public CustomerLogin() {
    }

    public CustomerLogin(Long id) {
        this.id = id;
    }

    public CustomerLogin(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getCustomerID() {
        return customerId;
    }

}
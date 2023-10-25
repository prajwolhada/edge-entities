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
@Table(name = "CUSTOMER_TRACKER")
public class CustomerTracker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Customer customer;

    @Column(name = "ACTIVATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activationDate;

    @Column(name = "ACTIVATION_CHANNEL")
    private String activationChannel;

    @Column(name = "FIRST_WEB_LOGIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstWebLoginDate;

    @Column(name = "FIRST_MOBILE_LOGIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstMobileLoginDate;

    @Column(name = "OMNI_CHANNEL_VERIFY")
    private Character omniChannelVerify;

    @Column(name = "LAST_LOGIN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;

    @Column(name = "LAST_LOGIN_CHANNEL")
    private String lastLoginChannel;

    @Column(name = "CURRENT_LOGIN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currentLoginTime;

    @Column(name = "CURRENT_LOGIN_CHANNEL")
    private String currentLoginChannel;

    public CustomerTracker() {
    }

    public boolean isFirstMobileLogin() {
        if (this.firstMobileLoginDate == null) {
            return true;
        }
        return false;
    }

    public boolean isFirstWebLogin() {
        if (this.firstWebLoginDate == null) {
            return true;
        }
        return false;
    }
}
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
@Table(name = "LOGIN_ACCESS_CHANNEL")
public class LoginAccessChannel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @JoinColumn(name = "ACCESSIBLE_CHANNEL_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private AccessibleChannel accessibleChannel;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerLogin customerLogin;
    @Basic(optional = false)
    @Column(name = "ADDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @JoinColumn(name = "ADDED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private ApplicationUser addedBy;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private ApplicationUser lastModifiedBy;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "LOGIN_BLOCK_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginBlockDate;
    @Column(name = "REQUEST_ATTEMPT")
    private Integer requestAttempt;
    @Column(name = "LOGIN_BLOCKED")
    private String loginBlocked;
    @Column(name = "LOGIN_BLOCK_REMARKS", nullable = true, length = 80)
    private String loginBlockRemarks;
    @Column(name = "LOGIN_CHANNEL")
    private String loginChannel;
    @Column(name = "LOGIN_BLOCK_MODE ", nullable = true)
    private String loginBlockMode;
    public LoginAccessChannel() {
    }
}
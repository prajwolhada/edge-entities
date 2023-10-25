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
@Table(name = "LOGIN_DEVICE_INFO")
public class LoginDeviceInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Column(name = "OS_TYPE", length = 20)
    private String osType;
    @Column(name = "DEVICE_ID_UPDATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deviceIdUpdatedAt;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private CustomerLogin customerLogin;
    @Column(name = "DEVICE_MODEL")
    private String deviceModel;
    @Column(name = "DEVICE_EXTRA_DETAILS", columnDefinition = "TEXT")
    private String deviceExtraDetails;
    @Column(name = "GCM_REG_ID")
    private String gcmRegId;
    @Column(name = "GCM_ENABLED", length = 1)
    private Character gcmEnabled;
    @Column(name = "GCM_ACTIVATION_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gcmActivationAt;
    @Column(name = "LOGIN_DEVICE_MODE", length = 25)
    private String loginDeviceMode;
    @Column(name = "CUSTOMER_ID", precision = 22)
    private Long customerId;
    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private ApplicationUser lastModifiedBy;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "VERSION_ID")
    private String versionId;

    public LoginDeviceInfo() {
    }

}
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
@Table(name = "WEB_TRUSTED_FINGERPRINT")
public class WebTrustedFingerprint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACTIVE")
    private char active;
    @Column(name = "FINGERPRINT")
    private String fingerPrint;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private CustomerLogin customerLogin;
    @Column(name = "DEVICE_OS")
    private String deviceOS;
    @Column(name = "BROWSER")
    private String browser;
    @Column(name = "CLIENT_IP")
    private String clientIp;
    @Column(name = "DEVICE_TYPE")
    private String deviceType;
    @Column(name = "REQUESTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    public WebTrustedFingerprint() {
    }

}
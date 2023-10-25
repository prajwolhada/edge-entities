package com.flsoft.bankxp.edge.entities.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "MOBILE_LOGIN_INFO")
public class MobileLoginInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long Id;
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Column(name = "CLIENT_IP")
    private String clientIp;
    @Column(name = "CUSTOMER_ID", precision = 22)
    private Long customer;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private CustomerLogin customerLogin;
    @Column(name = "DEVICE_DETAILS", columnDefinition = "TEXT")
    private String deviceDetails;
    @Column(name = "LOGIN_DATE", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginDate;
    @Column(name = "LATITUDE")
    private String latitude;
    @Column(name = "LONGITUDE")
    private String longitude;

}

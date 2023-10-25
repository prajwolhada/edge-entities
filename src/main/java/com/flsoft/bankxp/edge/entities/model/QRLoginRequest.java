package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "QR_LOGIN_REQUEST")
public class QRLoginRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "UNIQUE_ID")
    private String uniqueId;
    @Column(name = "QR_LOGIN_ID")
    private String qrLoginId;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "RECORDED_DATE")
    private Date recordedDate;
    @Column(name = "DEVICE_OS")
    private String deviceOS;
    @Column(name = "BROWSER")
    private String browser;
    @Column(name = "CLIENT_IP")
    private String clientIp;
    @Column(name = "DEVICE_TYPE")
    private String deviceType;
    @Column(name = "VERIFY")
    private Character verify;
    @Column(name = "STATUS")
    private String status;
}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author prajwol.hada
 */
@Getter
@Setter
@Entity
@Table(name = "WEB_LOGIN_INFO")
public class WebLoginInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long Id;
    @Column(name = "USER_AGENT")
    private String userAgent;
    @Column(name = "CLIENT_IP")
    private String clientIp;
    @Column(name = "LOGIN_DATE", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginDate;
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;
    @Column(name = "LATITUDE")
    private String latitude;
    @Column(name = "LONGITUDE")
    private String longitude;
}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "THIRD_PARTY_LOGIN_LOG")
@Getter
@Setter
public class ThirdPartyLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "USERNAME", length = 50)
    private String username;
    @Column(name = "CUSTOMER_LOGIN_ID", length = 50)
    private Long customerLoginId;
    @Basic(optional = false)
    @Column(name = "LAST_LOGIN_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;
    @Column(name = "STATUS", length = 50)
    private String status;
    @Column(name = "REASON", length = 250)
    private String reason;
    @Column(name = "RESULT_CODE", length = 50)
    private String resultCode;
}

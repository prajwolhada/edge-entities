package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "EMAIL_VERIFICATION_REQUEST")
public class EmailVerificationRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @Column(name = "CODE", nullable = false)
    private String code;

    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    @Column(name = "EMAIL_TOKEN", nullable = false)
    private String emailToken;

    @Column(name = "ACTIVE", nullable = false)
    private Character active;

    @Column(name = "CUSTOMER_LOGIN_ID", nullable = false)
    private Long customerLoginId;

    @Column(name = "EMAIL_ADDRESS", nullable = false)
    private String emailAddress;

    @Column(name = "IS_USED ", nullable = false)
    private Character isUsed;

    @Transient
    private String token;

}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Prajwol Hada
 */

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_ACTIVATION_SMS_VERIFY")
public class CustomerActivationSmsVerify implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REGISTRATION_ID")
    private String registrationId;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "CODE")
    private String code;
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "VERIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date verifiedDate;
    @Column(name = "VERIFY")
    private char verify;
    @Column(name = "TYPE", nullable = false)
    private String type;
}

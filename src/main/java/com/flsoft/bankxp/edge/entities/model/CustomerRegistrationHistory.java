package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Sandhya Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_REGISTRATION_HISTORY")
public class CustomerRegistrationHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "MOBILE_NUMBER", nullable = false, length = 15)
    private String mobileNumber;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "REASON", nullable = true, length = 255)
    private String reason;
    @Column(name = "ACTIVATION_TOKEN", nullable = false, length = 250)
    private String activationToken;
    @Column(name = "ACCOUNT_NUMBER", nullable = true, length = 500)
    private String accountNumber;
    @Column(name = "USER_TYPE", nullable = false, length = 250)
    private String userType;
    @Column(name = "CHANNEL", nullable = false, length = 250)
    private String channel;
    @Column(name = "ACTIVATION_STAGE", length = 100)
    private String activationStage;
}
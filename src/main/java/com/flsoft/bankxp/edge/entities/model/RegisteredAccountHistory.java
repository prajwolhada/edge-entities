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
@Table(name = "REGISTERED_ACCOUNT_HISTORY")
public class RegisteredAccountHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "MOBILE_NUMBER", nullable = false, length = 15)
    private String mobileNumber;
    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 500)
    private String accountNumber;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "REASON")
    private String reason;
    @Column(name = "CODE", length = 50)
    private String code;
    @Column(name = "REGISTRATION_ID", nullable = false, length = 250)
    private String registrationId;
    @Column(name = "ACTIVATION_STAGE", length = 50)
    private String activationStage;

}
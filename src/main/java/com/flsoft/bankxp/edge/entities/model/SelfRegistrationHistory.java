package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author sandhya.pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "SELF_REGISTRATION_HISTORY")
public class SelfRegistrationHistory implements Serializable {

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
    @Column(name = "CODE", nullable = true, length = 50)
    private String code;
    @Column(name = "REASON", nullable = true, length = 255)
    private String reason;
    @Column(name = "REGISTRATION_ID", nullable = false, length = 250)
    private String registrationId;
    @Column(name = "CITIZENSHIP_ID", nullable = true, length = 255)
    private String citizenshipId;
    @Column(name = "DOB", nullable = true, length = 255)
    private String dob;
    @Column(name = "ATM_CARD_SIX_DIGIT", nullable = true, length = 255)
    private String atmCardDigit;

}
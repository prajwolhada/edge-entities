package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Bikash Shah
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_REGISTRATION_LOG")
public class CustomerRegistrationLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

    @Column(name = "CHANNEL")
    private String channel;

    @Column(name = "PRIMARY_ACCOUNT_NUMBER")
    private String primaryAccountNumber;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "PROFILE_ID")
    private Long profileId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

}
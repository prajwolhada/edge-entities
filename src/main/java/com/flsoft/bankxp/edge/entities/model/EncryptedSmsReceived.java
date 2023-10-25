package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ENCRYPTED_SMS_RECEIVED")
public class EncryptedSmsReceived implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "SMS_TEXT")
    private String smsText;
    @Basic(optional = false)
    @Column(name = "SERVICE_PROVIDER_ID")
    private long serviceProviderId;
    @Basic(optional = false)
    @Column(name = "CHANNEL")
    private String channel;
    @Basic(optional = false)
    @Column(name = "RECEIVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedDate;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

}

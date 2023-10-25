package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "FCM_SENT", uniqueConstraints = { @UniqueConstraint(columnNames = {"SMS_SENT_ID"})})
public class FCMSent implements Serializable {

    private static final Long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "MESSAGE_ID")
    private String messageId;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "SEND_DATE")
    private Date sendDate;

    @Column(name = "CHANNEL_PROVIDER_ID")
    private Long channelProviderId;

    @Column(name = "PRIORITY")
    private Integer priority;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "SMS_SENT_ID")
    private Long smsSentId;

}

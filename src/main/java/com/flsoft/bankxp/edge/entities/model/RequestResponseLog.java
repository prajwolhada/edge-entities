package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author gita
 */
@Getter
@Setter
@Entity
@Table(name = "REQUEST_RESPONSE_LOG")
public class RequestResponseLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "RECEIVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedDate;
    @Column(name = "CUSTOMER_ACTIVITY_TYPE_ID")
    private Long customerActivityTypeId;
    @Column(columnDefinition = "TEXT", name = "REQUEST_PARAMETER")
    private String requestParameter;
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;
    @Column(name = "ACCESSIBLE_CHANNEL_ID")
    private Long accessibleChannelId;
    @Column(name = "SEND_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;
    @Column(columnDefinition = "TEXT", name = "RESPONSE_TEXT")
    private String responseText;
    @Column(name = "REQUEST_PATH")
    private String requestPath;
    @Column(name = "FEATURE_ID")
    private Long featureId;
    @Column(name = "TOKEN", length = 200)
    private String token;
    @Column(name = "TYPE", length = 10)
    private String type;
    @Column(name = "REQUESTED_FOR", nullable = true)
    private String requestedFor;
    @Column(name = "REQUEST_STATUS", nullable = true)
    private String requestStatus;
    @Column(name = "CLIENT_IP", nullable = true)
    private String clientIP;
    @Column(name = "DEVICE_DETAILS", columnDefinition = "TEXT", nullable = true)
    private String deviceDetails;
    @Column(name = "CHANNEL_ID", nullable = true)
    private Long channelId;
    @Column(name = "UNICODE_RESPONSE_TEXT", columnDefinition = "TEXT")
    private String unicodeResponseText;
    @Column(name = "DEVICE_TYPE")
    private String deviceType;
    @Column(name = "DEVICE")
    private String device;
    @Column(name = "BUILD_NUMBER")
    private String buildNumber;

    public Long getId() {
        return id;
    }
}

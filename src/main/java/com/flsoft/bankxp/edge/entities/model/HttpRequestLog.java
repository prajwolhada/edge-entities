package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Dilip Mandal
 */
@Getter
@Setter
@Entity
@Table(name = "HTTP_REQUEST_LOG")
public class HttpRequestLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
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
    @Column(name = "REQUEST_PATH")
    private String requestPath;
    @Column(name = "FEATURE_ID")
    private Long featureId;
    @Column(name = "TOKEN", length = 200)
    private String token;
    @Column(name = "TYPE", length = 10)
    private String type;
    @Column(name = "REQUESTED_FOR")
    private String requestedFor;
    @Column(name = "CLIENT_IP")
    private String clientIP;
    @Column(name = "DEVICE_DETAILS", columnDefinition = "TEXT")
    private String deviceDetails;
    @Column(name = "CHANNEL_ID")
    private Long channelId;
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Column(name = "FINGERPRINT")
    private String fingerprint;
    @Column(name = "BROWSER")
    private String browser;
    @Column(name = "OS")
    private String os;
    @Column(name = "deviceType")
    private String deviceType;
    @Column(name = "UNIQUE_IDENTIFIER")
    private String uniqueIdentifier;

    public HttpRequestLog() {
    }

    public HttpRequestLog(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

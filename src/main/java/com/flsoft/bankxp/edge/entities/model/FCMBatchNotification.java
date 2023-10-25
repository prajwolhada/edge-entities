package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "FCM_BATCH_NOTIFICATION")
public class FCMBatchNotification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @JoinColumn(name = "FCM_MESSAGE_ID", referencedColumnName = "ID")
    @ManyToOne()
    private FCMMessage fcmMessage;
    @Column(name = "FCM_APP_ID")
    private String fcmAppId;
    @Column(name = "FCM_WEB_ID")
    private String fcmWebId;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "NOTIFIED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date notifiedAt;
    @Column(name = "CHANNEL_TYPE", length = 20)
    private String channelType;
    @Column(name = "SEND_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sentDate;
}

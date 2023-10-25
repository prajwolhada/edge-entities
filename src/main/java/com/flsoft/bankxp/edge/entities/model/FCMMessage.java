package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "FCM_MESSAGE")
public class FCMMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "MESSAGE", columnDefinition = "TEXT")
    private String message;
    @Column(name = "MESSAGE_DETAIL", columnDefinition = "TEXT")
    private String messageDetail;
    @Column(name = "BANNER_URL")
    private String bannerUrl;
    @Column(name = "BANNER_IMAGE")
    private String bannerImage;
    @Column(name = "SENT_BY")
    private Long sentBy;
    @Column(name = "SEND_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sentDate;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "CHANNEL_TYPE")
    private String channelType;
    @Column(name = "NOTIFIED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date notifiedAt;
    @Column(name = "MESSAGE_ID")
    private String messageId;
    @Column(name = "REMARKS")
    private String remarks;
    @JoinColumn(name = "FCM_NOTIFIER_ID", referencedColumnName = "ID")
    @ManyToOne()
    private FCMNotifierType fCMNotifierType;
    @Column(name = "ORIGIN")
    private String origin;
    @Column(name = "DELIVERY_TO")
    private String deliveryTo; //ALL, USER, PROFILE
    @Column(name = "DELIVERY_ENTITY_ID")
    private Long deliveryEntityId; //Not EMPTY for profile only
    @Column(name = "UNIQUE_ID")
    private String uniqueId;

    public FCMMessage() {
    }
}

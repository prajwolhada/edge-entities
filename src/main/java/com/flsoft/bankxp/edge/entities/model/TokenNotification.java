package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Rashim Dhaubanjar
 */
@Getter
@Setter
@Entity
@Table(name = "TOKEN_NOTIFICATION")
public class TokenNotification implements Serializable {

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
    @Column(name = "DATAS", columnDefinition = "TEXT")
    private String datas;
    @Column(name = "LINK")
    private String link;
    @Column(name = "IMAGE_PATH")
    private String imagePath;
    @Column(name = "SENT_BY")
    private Long sentBy;
    @Column(name = "SEND_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "CHANNEL_TYPE")
    private String channelType;
    @Column(name = "USER_TYPE", nullable = false)
    private String userType;
    @Column(name = "USER_ID", nullable = false)
    private Long userId;
    @Column(name = "NOTIFIED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date notifiedAt;
    @Column(name = "MESSAGE_ID")
    private String messageId;
    @Column(name = "REMARKS")
    private String remarks;

    public TokenNotification() {
    }
}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "BROADCAST_MESSAGE")
public class BroadcastMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(columnDefinition = "TEXT", name = "MESSAGE")
    private String message;
    @Column(columnDefinition = "TEXT", name = "PLAIN_MESSAGE")
    private String plainMessage;
    @Column(name = "TITLE", nullable = true)
    private String title;
    @Column(name = "BANNER_URL", length = 200, nullable = true)
    private String bannerUrl;
    @Column(name = "MESSAGE_SEND_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date messageSentDate;
    @Column(name = "SENT_BY")
    private Long sentBy;
    @Column(name = "BANNER_IMAGE", length = 255, nullable = true)
    private String bannerImage;
}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "FCM_MESSAGE_LINK_STATUS")
public class FcmMessageLinkStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "FCM_MESSAGE_ID")
    private Long fcmMessageId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RECORDED_DATE")
    private Date recordedDate;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "UNIQUE_ID")
    private String uniqueId;
    @Column(name = "LINK")
    private String link;
}

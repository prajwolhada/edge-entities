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
@Table(name = "FCM_MESSAGE_STATUS")
public class FCMMessageStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "USER_ID", nullable = false)
    private Long userId;
    @Column(name = "SEEN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date seenTime;
    @Column(name = "FCM_MESSAGE_ID")
    private Long fcmMessageId;

    public FCMMessageStatus() {
    }
}

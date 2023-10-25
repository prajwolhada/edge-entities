package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author srijan
 */
@Getter
@Setter
@Entity
@Table(name = "GCM_NOTIFIER")
public class GcmNotifier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CUSTOMER_ID", length = 50, nullable = false)
    private Long customerId;

    @Column(name = "STATUS", length = 20, nullable = false)
    private String status;

    @Column(name = "MESSAGE_ID")
    private Long messageId;

    @Column(name = "NOTIFIED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date notifiedAt;

    @Column(name = "ERROR_CODE", length = 20)
    private String errorCode;

    @Column(name = "ERROR_DESCRIPTION", length = 100)
    private String errorDescription;

    @Column(name = "CHANNEL_TYPE", length = 30)
    private String channelType;

    @JoinColumn(name = "GCM_NOTIFICATION_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne
    private GcmNotification gcmNotification;

    @Column(name = "GCM_REG_ID")
    private String gcmRegId;

}

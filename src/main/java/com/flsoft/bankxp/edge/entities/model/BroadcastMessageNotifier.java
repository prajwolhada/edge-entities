package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "BROADCAST_MESSAGE_NOTIFIER")
public class BroadcastMessageNotifier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @JoinColumn(name = "BROADCAST_MESSAGE_ID", referencedColumnName = "ID")
    @ManyToOne()
    private BroadcastMessage broadcastMessage;
    @Column(name = "RECEIVER_ID", nullable = true, precision = 19, scale = 0)
    private Long receiverId;
    @Column(name = "STATUS", length = 10)
    private String status;
    @Column(name = "CHANNEL_TYPE", length = 20)
    private String channelType;
    @Column(name = "NOTIFIED_TO", length = 250)
    private String notifiedTo;
    @Column(name = "NOTIFIED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date notifiedAt;
}

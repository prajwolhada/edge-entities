package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Swaroop Tewari
 */
@Entity
@Table(name = "THIRD_PARTY_CONVERGENT_NOTIFY")
@Getter
@Setter
public class ThirpartyConvergentNotify implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "CONVERGENT_BOOKING_ID")
    private Long convergentBookingId;
    @Column(name = "QR_REQUEST_ID", length = 255)
    private String qrRequestId;
    @Column(name = "CLIENT_PRN", length = 255)
    private String clientPrn;
    @Column(name = "FONEPAY_TRACE_ID", length = 255)
    private String fonepayTraceId;
    @Column(name = "STATUS", length = 255)
    private String status;
    @Column(name = "FONEPAY_MESSAGE", length = 255)
    private String fonepayMessage;
    @Column(name = "TYPE", length = 255)
    private String type;
    @Column(name = "REQUESTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
}

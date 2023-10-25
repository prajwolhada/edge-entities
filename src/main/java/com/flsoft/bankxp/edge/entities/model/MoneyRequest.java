package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author srijan
 */
@Getter
@Setter
@Entity
@Table(name = "MONEY_REQUEST")
public class MoneyRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "REQUESTER_LOGIN_ID", referencedColumnName = "ID", nullable = false)
    private CustomerLogin requesterLogin;

    @ManyToOne()
    @JoinColumn(name = "RECIPIENT_LOGIN_ID", referencedColumnName = "ID", nullable = false)
    private CustomerLogin recipientLogin;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQUESTED_DATE", nullable = false)
    private Date requestedDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "APPROVED_DATE")
    private Date approvedDate;

    @Column(name = "PROCESS_STATUS", length = 20)
    private String status;

    @Column(name = "INITIATOR_REMARKS", length = 255)
    private String initiatorRemarks;

    @Column(name = "RECEPIENT_REMARKS", length = 255)
    private String recipientRemarks;

    @Column(name = "REQUESTED_AMOUNT", nullable = false, precision = 17, scale = 2)
    private Double requestedAmount;

    @Column(name = "APPROVED_AMOUNT", precision = 17, scale = 2)
    private Double approvedAmount;

    @OneToOne()
    @JoinColumn(name = "ISO_TXN_REQUEST_ID", referencedColumnName = "ID")
    private IsoTxnRequest isoTxnRequestId;
}

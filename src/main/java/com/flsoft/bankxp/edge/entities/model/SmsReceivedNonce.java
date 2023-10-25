package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Sandhya Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "SMS_RECEIVED_NONCE",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"NONCE"})
        }
)
public class SmsReceivedNonce implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "NONCE")
    private String nonce;
    @Column(name = "SMS_RECEIVED_ID")
    private Long smsReceivedId;
}
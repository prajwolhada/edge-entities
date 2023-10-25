package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author sandhya.pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "SCHEDULE_TXN_ENTRY_LOG")
public class ScheduleTxnEntryLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "SCHEDULE_PAYMENT_ID", nullable = true, precision = 38, scale = 0)
    private Long scheduePaymentId;
    @Basic(optional = false)
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "REMARKS", length = 255)
    private String remarks;

}
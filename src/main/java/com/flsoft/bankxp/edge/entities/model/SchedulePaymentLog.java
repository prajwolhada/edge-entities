/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author gita
 */
@Getter
@Setter
@Entity
@Table(name = "SCHEDULE_PAYMENT_LOG")
public class SchedulePaymentLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "SCHEDULE_PAYMENT_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne
    SchedulePayment schedulePayment;
    @Basic(optional = false)
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "PAYMENT_STATUS", length = 200)
    private String paymentStatus;
    @Column(name = "REMARKS", length = 200)
    private String remarks;
    @Column(name = "SCHDEULE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduleDate;
    @Column(name = "REQUEST_INFO_ID")
    private Long requestInfoId;

}
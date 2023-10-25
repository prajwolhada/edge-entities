/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author gita
 */
@Getter
@Setter
@Entity
@Table(name = "SCHEDULE_PAYMENT_PARAMETER")
public class SchedulePaymentParameter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "PARAMETER_ORDER", length = 2)
    private Integer parameterOrder;
    @Basic(optional = false)
    @Column(name = "PARAMETER_NAME")
    private String parameterName;
    @Basic(optional = false)
    @Column(name = "PAYMENT_PARAMETER")
    private String paymentParameter;
    @Column(name = "MERCHANT_PAYMENT_PARAMETER_ID", nullable = false, precision = 22)
    private Long merchantPaymentParameterId;
    @JoinColumn(name = "SCHEDULE_PAYMENT_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private SchedulePayment schedulePayment;

}
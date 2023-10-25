package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Dilip Mandal
 */

@Getter
@Setter
@Entity
@Table(name = "TAPNPAY_LINK_REQUEST")
public class TapnpayLinkRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "SERVICE")
    private String service;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "BOOKING_ID")
    private String bookingId;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

}

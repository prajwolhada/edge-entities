package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Richa Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "TAPNPAY_CUSTOM_ACCOUNT")
public class TapnpayCustomAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "TOKEN")
    private String token;
    @Column(name = "EXPIRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "SERVICE")
    private String service;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @OneToOne
    @JoinColumn(name = "TAPNPAY_LINK_REQUEST_ID", referencedColumnName = "ID")
    private TapnpayLinkRequest tapnpayLinkRequest;
}

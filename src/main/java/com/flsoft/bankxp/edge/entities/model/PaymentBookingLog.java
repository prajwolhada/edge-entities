package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "PAYMENT_BOOKING_LOG")
public class PaymentBookingLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Merchant merchant;
    @Basic(optional = false)
    @Column(name = "ACTIVE", length = 1)
    private char active;
    @Basic(optional = false)
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long  customerLogin;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(columnDefinition = "TEXT", name = "PAYMENT_DETAILS")
    private String paymentDetails;
    @Column(name = "BOOKING_ID")
    private String bookingId;


    @PrePersist
    public void initialize() {
        addedDate = new Date();
    }

}

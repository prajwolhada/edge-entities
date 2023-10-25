package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Prajwol hada
 */
@Getter
@Setter
@Entity
@Table(name = "OFFER_TRANSACTION")
public class OfferTransaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REQUEST_INFO_ID", nullable = false)
    private Long requestInfoId;
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "TRANSACTION_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "PROMO_CODE", nullable = false)
    private String promoCode;
    @Column(name = "OFFER_TYPE", nullable = false)
    private String offerType;
    @Column(name = "AMOUNT", nullable = false)
    private String amount;
    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;
    @Column(name = "STATUS", nullable = false)
    private String status;
    @Column(name = "OFFER_BOOKING_ID", nullable = false)
    private String offerBookingId;
    @Column(name = "REMARKS")
    private String remarks;
}

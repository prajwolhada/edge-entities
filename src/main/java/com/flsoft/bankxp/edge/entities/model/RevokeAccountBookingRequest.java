package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Table(name = "REVOKE_ACCOUNT_BOOKING_REQUEST")
@Entity
public class RevokeAccountBookingRequest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "ACCOUNT_LINK_BOOKING_ID", length = 150)
    private String accountLinkBookingId;
    @Column(name = "BOOKING_ID", length = 150)
    private String bookingId;
    @Column(name = "BOOKING_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingDate;
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    public RevokeAccountBookingRequest() {
    }

    public RevokeAccountBookingRequest(Long id) {
        this.id = id;
    }
}

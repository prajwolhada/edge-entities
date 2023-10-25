package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Shreetika Panta
 */

@Getter
@Setter
@Entity
@Table(name = "MOBILE_AUTHORIZATION_ACTIVITY")
public class MobileAuthorizationActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "TYPE", nullable = false)
    private String type;
    @Basic(optional = false)
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "ACTIVITY_TYPE", nullable = false)
    private String activityType;
    @Column(name = "STATUS", nullable = false)
    private String status;
    @Column(name = "BOOKING_ID", nullable = false)
    private String bookingId;
    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;


}

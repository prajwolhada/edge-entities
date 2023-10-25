package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "APPOINTMENT")
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "REASON", nullable = false)
    private String reason;

    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    private String firstName;

    @Column(name = "MIDDLE_NAME", length = 50)
    private String middleName;

    @Column(name = "LAST_NAME", nullable = false, length = 50)
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "BRANCH", nullable = false)
    private String branch;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "MOBILE_NUMBER", nullable = false, length = 10)
    private String mobileNumber;

    @Column(name = "STATUS", length = 20, nullable = false)
    private String status;

    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    @Column(name = "ACKNOWLEDGED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date acknowledgedDate;

    @Column(name = "SCHEDULED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduledDate;

    @JoinColumn(name = "MODIFIED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser approvedBy;
}

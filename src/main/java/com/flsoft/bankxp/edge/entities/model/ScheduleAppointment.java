package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Sabrin Luitel
 */
@Getter
@Setter
@Entity
@Table(name = "SCHEDULE_APPOINTMENT")
public class ScheduleAppointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CUSTOMER_NAME", nullable = false)
    private String customerName;

    @Column(name = "MOBILE_NUMBER", nullable = false)
    private String mobileNumber;

    @Column(name = "PREFERRED_DEPARTMENT")
    private String preferredDepartment;

    @Column(name = "PREFERRED_PERSON")
    private String preferredPerson;

    @Column(name = "VISIT_PURPOSE", nullable = false)
    private String visitPurpose;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    @Column(name = "APPOINTMENT_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date appointmentDate;

    @JoinColumn(name = "BRANCH_ID")
    @ManyToOne()
    private Branch branch;

    @Column(name = "TYPE_OF_VISIT")
    private String typeOfVisit;

    @Column(name = "APPOINTMENT_TYPE")
    private String appointmentType;

    @Column(name = "DESCRIPTION")
    private String description;
}

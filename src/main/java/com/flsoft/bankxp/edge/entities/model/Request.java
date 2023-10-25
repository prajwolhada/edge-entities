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
@Table(name = "REQUEST")
public class Request implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "REQUEST_TYPE", length = 25)
    private String requestType;
    @Basic(optional = false)
    @Column(name = "IS_CONFIRMED", nullable = false)
    private Character isConfirmed;
    @Column(name = "CONFIRMED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date confirmedDate;
    @JoinColumn(name = "BRANCH_ID")
    @ManyToOne()
    private Branch branch;
    @Column(name = "PROCESS_STATUS", length = 1)
    private Integer processStatus;
    @JoinColumn(name = "PROCESS_INITIATED_BY")
    @ManyToOne()
    private ApplicationUser processInitiatedBy;
    @JoinColumn(name = "PROCESS_COMPLETED_BY")
    @ManyToOne()
    private ApplicationUser processCompletedBy;
    @Column(name = "IS_NOTIFIED")
    private Integer isNotified;
    @Column(name = "REMARKS", nullable = true, length = 255)
    private String remarks;
    @Column(name = "PROCESS_INITIATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processInitiatedDate;
    @Column(name = "PROCESS_COMPLETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processCompletedDate;
    @JoinColumn(name = "REJECTED_BY")
    @ManyToOne()
    private ApplicationUser rejectedBy;
    @Column(name = "REJECTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rejectedDate;
    @Column(name = "REJECTED_REMARKS", nullable = true, length = 255)
    private String rejectRemarks;
    @JoinColumn(name = "LAST_FORWARD_BY")
    @ManyToOne()
    private ApplicationUser lastForwardBy;
    @Column(name = "LAST_FORWARD_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastForwardDate;
    @JoinColumn(name = "REQUEST_INFO_ID")
    @OneToOne()
    private RequestInfo requestInfo;

    public Request() {
    }
}
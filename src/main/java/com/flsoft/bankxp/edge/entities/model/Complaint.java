package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author santosh
 */
@Getter
@Setter
@Entity
@Table(name = "COMPLAINT")
public class Complaint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(name = "MOBILE_NUMBER", length = 15)
    private String mobileNumber;
    @Column(name = "PROCESS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processDate;
    @Column(name = "PROCESS_BY", length = 100)
    private String processBy;
    @Basic(optional = false)
    @Column(name = "PROCESS_STATUS", nullable = false)
    private Integer processStatus;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "MESSAGE", length = 200)
    private String message;
    @Column(name = "IS_FORWARDED")
    private Character isForwarded;
    @Column(name = "FORWARD_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date forwardDate;
    @Column(name = "REMARKS", length = 255)
    private String remarks;
    @JoinColumn(name = "FORWARD_BRANCH_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Branch forwardBranch;
    @JoinColumn(name = "FORWARD_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser forwardBy;
    @Transient
    private boolean selected;
    @Transient
    private boolean checked;

    public Complaint() {
    }

    public Complaint(Long id) {
        this.id = id;
    }

}

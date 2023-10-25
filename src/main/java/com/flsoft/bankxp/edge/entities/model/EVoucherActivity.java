package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Rashim Dhaubanjar
 */
@Getter
@Setter
@Entity
@Table(name = "EVOUCHER_ACTIVITY")
public class EVoucherActivity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @Column(name = "STATUS")
    private String status;

    @ManyToOne()
    @JoinColumn(name = "EVOUCHER_ID")
    private EVoucher evoucher;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;

    @JoinColumn(name = "APPLICATION_USER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser applicationUser;
}

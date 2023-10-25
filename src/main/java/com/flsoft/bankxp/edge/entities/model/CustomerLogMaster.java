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
@Table(name = "CUSTOMER_LOG_MASTER")
public class CustomerLogMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "STATUS", nullable = false, length = 50)
    private String status;
    @Basic(optional = false)
    @Column(name = "REMARKS", nullable = false, length = 250)
    private String remarks;
    @Basic(optional = false)
    @Column(name = "INITIATOR", nullable = false, length = 50)
    private String initiator;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RECORDED_DATE")
    private Date recordedDate;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private Customer customer;
    @JoinColumn(name = "APPLICATION_USER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser applicationUser;
    @JoinColumn(name = "CUSTOMER_LOG_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne()
    private CustomerLogType customerLogType;

}

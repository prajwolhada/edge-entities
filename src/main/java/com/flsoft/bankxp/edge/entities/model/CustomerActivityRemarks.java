package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author rachit
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_ACTIVITY_REMARKS")
public class CustomerActivityRemarks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false, precision = 22)
    private Long id;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "ACTIVITY", length = 20)
    private String activity;
    @Column(name = "REMARKS", length = 500)
    private String remarks;
    @Column(name = "REMARKS_BY", length = 50)
    private String remarksBy;
    @Column(name = "BRANCH_CODE", length = 50)
    private String branchCode;
    @Column(name = "REMARKS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date remarksDate;
    @JoinColumn(name = "ACCESSIBLE_CHANNEL_ID")
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private AccessibleChannel accessibleChannelId;
    @Basic(optional = false)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    @ManyToOne()
    private Customer customer;

    public CustomerActivityRemarks() {
    }

    public CustomerActivityRemarks(Long id) {
        this.id = id;
    }
}

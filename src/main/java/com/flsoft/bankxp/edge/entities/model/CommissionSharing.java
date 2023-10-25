package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author root
 */
@Getter
@Setter
@Entity
@Table(name = "COMMISSION_SHARING")
public class CommissionSharing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACTIVE")
    private char active;
    @Basic(optional = false)
    @Column(name = "COMMISSION_RATE")
    private String commissionRate;
    @Basic(optional = false)
    @Column(name = "COMMISSION_TYPE")
    private Character commissionType;
    @JoinColumn(name = "COMMISSION_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private CommissionInformation commissionInformation;
    @JoinColumn(name = "COMMISSION_PARTNER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private CommissionPartner commissionPartner;
    @Basic(optional = false)
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "ID")
    @ManyToOne
    private ApplicationUser createdBy;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID")
    @ManyToOne
    private ApplicationUser lastModifiedBy;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    public CommissionSharing() {
    }

    public CommissionSharing(Long id) {
        this.id = id;
    }
}

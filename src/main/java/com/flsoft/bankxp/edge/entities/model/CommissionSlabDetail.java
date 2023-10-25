package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "COMMISSION_SLAB_DETAIL")
public class CommissionSlabDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "RANGE_FROM", precision = 18, scale = 2, nullable = false)
    private BigDecimal rangeFrom;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false)
    private char active;
    @Basic(optional = false)
    @Column(name = "RANGE_TO", precision = 18, scale = 2, nullable = false)
    private BigDecimal rangeTo;
    @Basic(optional = false)
    @Column(name = "CHARGE", precision = 18, scale = 2, nullable = false)
    private BigDecimal charge;
    @JoinColumn(name = "ADDED_BY", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private ApplicationUser addedBy;
    @Basic(optional = false)
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID")
    @ManyToOne()
    private ApplicationUser lastModifiedBy;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "MAX_RANGE_ACTIVE", nullable = false)
    private char maxRangeActive;
    @Basic(optional = false)
    @JoinColumn(name = "COMMISSION_SLAB_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private CommissionSlab commissionSlabId;
    @Column(name = "COMMISSION_TYPE", nullable = true, length = 2)
    private Character commissionType;
    @Transient
    private boolean validData;

    public CommissionSlabDetail() {
    }
}

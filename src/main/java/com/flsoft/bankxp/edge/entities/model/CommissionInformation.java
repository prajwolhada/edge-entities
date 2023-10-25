package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "COMMISSION")
public class CommissionInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private Merchant merchant;
    @JoinColumn(name = "COMMISSION_SLAB_ID", referencedColumnName = "ID")
    @ManyToOne()
    private CommissionSlab commissionSlab;
    @Column(name = "COMMISSION_RATE", nullable = true, length = 10)
    private String commissionRate;
    @Column(name = "COMMISSION_TYPE", nullable = true, length = 2)
    private Character commissionType;
    @Column(name = "REAL_TIME_SETTLEMENT", nullable = true, length = 1)
    private Character realTimeSettlement;
    @Column(name = "ACTIVE")
    private Character active;
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
    @JoinColumn(name = "FEATURE_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Feature feature;
    @OneToMany(mappedBy = "commissionInformation", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<CommissionSharing> commissionSharing;
    @JoinColumn(name = "COMMISSION_MODE_ID", referencedColumnName = "ID")
    @ManyToOne()
    private CommissionMode commissionMode;

    public CommissionInformation() {
    }
}
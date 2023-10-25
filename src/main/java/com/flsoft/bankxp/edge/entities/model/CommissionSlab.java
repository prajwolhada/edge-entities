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
@Table(name = "COMMISSION_SLAB")
public class CommissionSlab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "SLAB_NAME", nullable = false, length = 80)
    private String name;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false)
    private Character active;
    @Basic(optional = false)
    @Column(name = "DESCRIPTON", nullable = false, length = 100)
    private String description;
    @Basic(optional = false)
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
    @OneToMany(mappedBy = "commissionSlabId", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<CommissionSlabDetail> commissionSlabDetailList;

    public CommissionSlab() {
    }

}

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
@Table(name = "BRANCH")
public class Branch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "BRANCH_CODE", nullable = false, length = 20)
    private String branchCode;
    @Basic(optional = false)
    @Column(name = "BRANCH_NAME", nullable = false, length = 150)
    private String branchName;
    @Basic(optional = false)
    @Column(name = "BRANCH_LOCATION", nullable = false, length = 350)
    private String branchLocation;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;
    @Basic(optional = false)
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private ApplicationUser createdBy;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "MODIFIED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser modifiedBy;
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Basic(optional = false)
    @Column(name = "LATITUDE")
    private String latitude;
    @Basic(optional = false)
    @Column(name = "LONGITUDE")
    private String longitude;
    @Column(name = "CONTACT_NO")
    private String contactNo;
    @Column(name = "IPS_BRANCH_CODE")
    private String ipsBranchCode;
    @Column(name = "CHECK_TXN_ALERT", length = 1)
    private Character checkTxnAlert;
    @JoinColumn(name = "PROVINCE_ID", referencedColumnName = "ID", insertable = false, updatable = false, nullable = true)
    @ManyToOne()
    private Province province;
    @Basic(optional = false)
    @Column(name = "PROVINCE_ID", nullable = true)
    private Long provinceId;
    @JoinColumn(name = "DISTRICT_ID", referencedColumnName = "ID", insertable = false, updatable = false, nullable = true)
    @ManyToOne()
    private District district;
    @Basic(optional = false)
    @Column(name = "DISTRICT_ID", nullable = true)
    private Long districtId;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ALLOW_QUICK_ACCOUNT",length = 1)
    private Character allowQuickAccount;


    public Branch() {
    }

    public Branch(Long id) {
        this.id = id;
    }

}

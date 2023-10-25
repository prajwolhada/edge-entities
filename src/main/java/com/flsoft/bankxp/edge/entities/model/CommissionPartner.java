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
@Table(name = "COMMISSION_PARTNER")
public class CommissionPartner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "PARTNER_NAME", length = 50)
    private String partnerName;
    @Column(name = "COMMISSION_CODE", length = 25, nullable = false)
    private String commissionCode;
    @Column(name = "COMMISSION_CODE_TYPE", length = 15, nullable = true)
    private String commissionCodeType;
    @Column(name = "ADDRESS", length = 80)
    private String address;
    @Column(name = "COMPANY", length = 100)
    private String company;
    @Column(name = "CONTACT_NO", length = 50)
    private String contactNo;
    @Column(name = "EMAIL_ADDRESS", length = 50)
    private String emailAddress;
    @Basic(optional = false)
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private ApplicationUser createdBy;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser lastModifiedBy;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;

    public CommissionPartner() {
    }

    public CommissionPartner(Long id) {
        this.id = id;
    }

    public CommissionPartner(Long id, ApplicationUser createdBy, Date addedDate) {
        this.id = id;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }
}

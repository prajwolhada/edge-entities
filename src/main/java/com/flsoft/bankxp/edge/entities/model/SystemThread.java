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
@Table(name = "SYSTEM_THREAD")
public class SystemThread implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "ACTIVE", length = 1)
    private char active;

    @Column(name = "PARAM_CODE")
    private String paramCode;

    @Column(name = "PARAM_VALUE", length = 2000)
    private String paramValue;

    @Column(name = "ALLOWED_VALUE")
    private String allowedValue;

    @JoinColumn(name = "SYSTEM_THREAD_MASTER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private SystemThreadMaster systemThreadMaster;

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @JoinColumn(name = "CREATED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser createdBy;

    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser lastModifiedBy;
}
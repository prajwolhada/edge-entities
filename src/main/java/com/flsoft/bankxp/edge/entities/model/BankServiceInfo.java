package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author prajwol.hada
 */
@Getter
@Setter
@Entity
@Table(name = "BANK_SERVICE_INFO")
public class BankServiceInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION", length = 1000)
    private String description;
    @Column(name = "ACTIVE")
    private Character active;
    @JoinColumn(name = "ADDED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = false)
    private ApplicationUser addedBy;
    @Basic(optional = false)
    @Column(name = "ADDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @JoinColumn(name = "MODIFIED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = false)
    private ApplicationUser modifiedBy;
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "SORT_ORDER")
    private Integer sortOrder;
    @Column(name = "IMAGE_NAME")
    private String imageName;
    @Column(name = "IMAGE_PATH")
    private String imagePath;
    @Column(name = "START_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "TO_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDate;

}

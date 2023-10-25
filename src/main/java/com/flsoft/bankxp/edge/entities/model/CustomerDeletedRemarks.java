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
@Table(name = "CUSTOMER_DELETED_REMARKS")
public class CustomerDeletedRemarks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @OneToOne()
    private Customer customer;
    @Column(name = "LAST_MODIFIED_REMARKS", length = 100)
    private String lastModifiedRemarks;
    @Column(name = "LAST_TRACK_STATUS", length = 1)
    private Character lastTrackStatus;
    @Column(name = "LAST_MODIFIED_DATE", length = 100)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    public CustomerDeletedRemarks() {
    }

    public CustomerDeletedRemarks(Long id) {
        this.id = id;
    }
}
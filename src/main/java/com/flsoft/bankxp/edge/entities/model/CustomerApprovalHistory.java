package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author gita
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_APPROVAL_HISTORY")
public class CustomerApprovalHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Version
    @Column(name = "VERSION")
    private Long version;
    @Column(name = "APPROVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date approvedDate;

}

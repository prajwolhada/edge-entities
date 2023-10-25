package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_AUDIT_HISTORY")
public class CustomerAuditHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "EVENT", length = 20)
    private String event;
    @Column(name = "EVENT_DESCRIPTION", length = 255)
    private String eventDescription;
    @Column(name = "EVENT_TIMESTAMP", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventTimestamp;
    @JoinColumn(name = "CUSTOMER_AUDIT_MASTER_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerAuditMaster customerAuditMaster;
    @Basic(optional = false)
    @Column(name = "USER_ID", nullable = false, precision = 38, scale = 0)
    private Long userId;

}

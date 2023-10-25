package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "BANK_USER_AUDIT_MASTER")
public class BankUserAuditMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "EVENT", length = 30)
    private String event;
    @Column(name = "EVENT_TIMESTAMP", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventTimestamp;
    @Column(name = "USER_REF_ID", nullable = false, precision = 38, scale = 0)
    private Long userRefId;
    @Basic(optional = false)
    @Column(name = "USER_ID", nullable = false, precision = 38, scale = 0)
    private Long userId;
    @Column(name = "TYPE", length = 30)
    private String type;
}

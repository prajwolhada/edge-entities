package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "RENEW_REQUEST_RECORD")
public class RenewRequestRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "BANK_ACCOUNT_ID")
    private long bankAccountId;
    @Basic(optional = false)
    @Column(name = "LOG_DATE_TIME")
    private String logDateTime;
    @Basic(optional = false)
    @Column(name = "APPLICATION_USER_ID")
    private long applicationUserId;

}

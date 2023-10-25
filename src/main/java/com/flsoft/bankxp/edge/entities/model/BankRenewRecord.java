package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "BANK_RENEW_RECORD")
public class BankRenewRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "BANK_ACCOUNT_ID", nullable = false)
    private Long bankAccountId;
    @Basic(optional = false)
    @Column(name = "APPLICATION_USER_ID", nullable = false)
    private Long applicationUserId;
    @Basic(optional = false)
    @Column(name = "LOG_DATE_TIME", length = 50)
    private String logDateTime;
    @Basic
    @Column(name = "DO_TXN")
    private Character doTxn;
}

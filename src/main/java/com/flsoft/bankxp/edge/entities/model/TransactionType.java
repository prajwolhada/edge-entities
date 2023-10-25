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
@Table(name = "TRANSACTION_TYPE")
public class TransactionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "TYPE", nullable = false, length = 50)
    private String type;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_TYPE_NAME", nullable = false, length = 100)
    private String transactionTypeName;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private char active;
    @Column(name = "ALLOW_TXN_ALERT", length = 1, nullable = true)
    private char allowTxnAlert;
    @Transient
    private boolean alertAllow;
    @Transient
    private String previousTxnTypeName;

    public TransactionType() {
    }

    public TransactionType(Long id) {
        this.id = id;
    }
}
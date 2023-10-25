package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <krishna.pandey@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "TRANSACTION_LOG")
public class TransactionLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", precision = 22)
    private int id;
    @Column(name = "USERNAME", length = 15)
    private String username;
    @Column(name = "ACCOUNT_NUMBER", length = 20)
    private String accountNumber;
    @Column(name = "PROFILE_ID")
    private Long profileId;
    @Column(name = "SCHEME_CODE", length = 50)
    private String schemeCode;
    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "TRANSACTION_CODE", length = 100)
    private String transactionCode;
    @Column(name = "TRANSACTION_NAME", length = 100)
    private String transactionName;
    @Column(name = "TRANSACTION_TYPE", length = 50)
    private String transactionType;
    @Column(name = "CHANNEL")
    private String channel;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
}

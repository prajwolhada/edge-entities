package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "STATEMENT_REQUEST")
public class StatementRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "ACCOUNT_NAME", nullable = false)
    private String accountName;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "STATUS")
    private String status;

    @ManyToOne()
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    private Customer customerId;

    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    @Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    @Column(name = "TO_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDate;

}

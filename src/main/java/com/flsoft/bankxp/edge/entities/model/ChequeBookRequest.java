package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Sabrin Luitel
 */
@Getter
@Setter
@Entity
@Table(name = "CHEQUE_BOOK_REQUEST")
public class ChequeBookRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;

    @Column(name = "MOBILE_NUMBER", nullable = false)
    private String mobileNumber;

    @Column(name = "ACCOUNT_NAME", nullable = false)
    private String accountName;

    @Column(name = "ACCOUNT_TYPE", nullable = false)
    private String accountType;

    @Column(name = "STATUS")
    private String status;

    @ManyToOne()
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    private Customer customerId;

    @Column(name = "NO_OF_LEAVES", nullable = false)
    private String noOfLeaves;

    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    @Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "COLLECTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date collectionDate;
}

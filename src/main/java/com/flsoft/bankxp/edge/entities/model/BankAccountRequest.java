package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Sandhya Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "BANK_ACCOUNT_REQUEST")
public class BankAccountRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Basic(optional = false)
    @Column(name = "ACCOUNT_TYPE", nullable = false, length = 50)
    private String accountType;

    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    private String firstName;

    @Column(name = "MIDDLE_NAME", length = 50)
    private String middleName;

    @Column(name = "LAST_NAME", nullable = false, length = 50)
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "BRANCH", nullable = false)
    private String branch;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "MOBILE_NUMBER", nullable = false, length = 10)
    private String mobileNumber;

    @Column(name = "NATIONALITY", nullable = false, length = 50)
    private String nationality;

    @Column(name = "STATUS", nullable = false, length = 20)
    private String status;

    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;
    @Column(name = "ACCOUNT_NUMBER", nullable = true, length = 500)
    private String accountNumber;
    @Column(name = "ACKNOWLEDGED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date acknowledgedDate;
    @Column(name = "COMPLETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date completedDate;
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Column(name = "REJECTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rejectedDate;
    @JoinColumn(name = "ACKNOWLEDGED_BY", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private ApplicationUser acknowledgedBy;
    @ManyToOne(optional = true)
    private ApplicationUser approvedBy;
    @JoinColumn(name = "COMPLETED_BY", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private ApplicationUser completedBy;
    @JoinColumn(name = "REJECTED_BY", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private ApplicationUser rejectedBy;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    @OneToMany(mappedBy = "bankAccountRequest", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<BankAccountRequestHistory> history;

}

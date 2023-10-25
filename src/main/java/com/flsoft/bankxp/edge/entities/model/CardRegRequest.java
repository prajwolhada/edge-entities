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
 *
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "CARD_REG_REQUEST")
public class CardRegRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;

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

    @Column(name = "STATUS", length = 20, nullable = false)
    private String status;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "ACCOUNT_NUMBER", nullable = true, length = 500)
    private String accountNumber;

    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    @Column(name = "ACKNOWLEDGED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date acknowledgedDate;

    @JoinColumn(name = "MODIFIED_BY", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private ApplicationUser approvedBy;

    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    @Column(name = "COMPLETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date completedDate;

    @JoinColumn(name = "ACKNOWLEDGED_BY", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private ApplicationUser acknowledgedBy;

    @JoinColumn(name = "COMPLETED_BY", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private ApplicationUser completedBy;

    @OneToMany(mappedBy = "cardRegRequest", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<CardRegRequestHistory> history;

}

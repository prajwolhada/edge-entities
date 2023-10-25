package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Sabrin Luitel <sabrin.luitel@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_EVENT_LOG")
@NamedQueries({
        @NamedQuery(name = "CustomerEventLog.findByCustomerId", query = "SELECT c FROM CustomerEventLog c WHERE c.customer.id = :customerId")
})
public class CustomerEventLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long id;
    @Column(name = "TXN_DONE", length = 1, nullable = false)
    private Character txnDone;
    @Column(name = "LAST_TXN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastTxnDate;
    @Column(name = "FIRST_TXN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstTxnDate;
    @Column(name = "IS_FIRST_TXN", length = 1)
    private Character firstTxn;
    @Column(name = "LOGGED_IN_MODE")
    private String loggedInMode;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @OneToOne()
    private Customer customer;
    @Column(name = "FIRST_LOGGED_IN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstLoggedInDate;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @Column(name = "FIRST_TXN_ID", length = 1)
    private Long firstTxnId;

}

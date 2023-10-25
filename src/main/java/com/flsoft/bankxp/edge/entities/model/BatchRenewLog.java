package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Narayan Joshi
 * <narayan.joshi@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "BATCH_RENEW_LOG")
public class BatchRenewLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "MOBILE_NUMBER", length = 15, nullable = false)
    private String mobileNumber;
    @Column(name = "TXN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnDate;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Customer customer;
    @Column(name = "CUSTOMER_ID", nullable = false, precision = 38, scale = 0)
    private Long customerId;
    @Column(name = "PROCESS_STATUS", nullable = false)
    private Integer processStatus;
    @Column(name = "PROCESSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedDate;
    @JoinColumn(name = "BATCH_RENEW_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private BatchRenew batchRenew;

    public BatchRenewLog() {
    }

}

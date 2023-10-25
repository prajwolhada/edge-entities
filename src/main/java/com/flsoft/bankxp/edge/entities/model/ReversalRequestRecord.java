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
@Table(name = "REVERSAL_REQUEST_RECORD")
public class ReversalRequestRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "SERVICE_CODE")
    private String serviceCode;
    @Column(name = "REVERSAL_CHANNEL_ID")
    private Long reversalChannelId;
    @Column(name = "REVERSAL_SERVICE_ID")
    private Long reversalServiceId;
    @Column(name = "REQUEST_DATE")
    private String requestDate;
    @Column(name = "TRANSACTION_DATE")
    private String transactionDate;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "AMOUNT")
    private String amount;
    @Column(name = "UNIQUE_ID")
    private String uniqueId;
    @Column(name = "DETAILS")
    private String details;
    @Column(name = "REQUEST_INFO_ID")
    private Long requestInfoId;
    @Column(name = "TRACE_ID")
    private Long traceId;
    @Column(name = "REQUESTED_TRANSACTION_TYPE")
    private String requestedTransactionType;
    @Column(name = "TRANSACTION_TYPE")
    private String actualTransactionType;
}

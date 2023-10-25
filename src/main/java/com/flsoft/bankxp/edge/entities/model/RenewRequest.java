package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "RENEW_REQUEST")
public class RenewRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "CUSTOMER_LOGIN_ID", nullable = false, precision = 38, scale = 0)
    private Long customerLoginId;
    @Column(name = "PROFILE_ID", nullable = false, precision = 38, scale = 0)
    private Long profileId;
    @Column(name = "CHARGE_TYPE", length = 20)
    private String chargeType;
    @Basic(optional = true)
    @Column(name = "FROM_ACCOUNT", nullable = true, length = 50)
    private String fromAccount;
    @Basic(optional = true)
    @Column(name = "TO_ACCOUNT", nullable = true, length = 50)
    private String toAccount;
    @Column(name = "AMOUNT", precision = 17, scale = 2)
    private Double amount;
    @Basic(optional = false)
    @Column(name = "INITIATOR_BRANCH_ID", nullable = false)
    private Long initiatorBranchId;
    @Basic(optional = false)
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "RECORDED_BY", nullable = false, precision = 22)
    private Long recordedBy;
    @Column(name = "PROCESSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedDate;
    @Column(name = "PROCESS_STATUS")
    private Integer processStatus;
    @Column(name = "TXN_INITIATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnInitiatedDate;
    @Column(name = "EXPIRED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiredDate;
    @Column(name = "REMARKS", length = 255)
    private String remarks;
    @Column(name = "FUND_TRANSFER_TRACE_ID", length = 255)
    private String fundTransferTraceId;
    @Column(name = "FUND_TRANSFER_STATUS")
    private Integer fundTransferStatus;
    @Column(name = "FUND_TRANSFER_ERROR_CODE", length = 10)
    private String fundTransferRrrorCode;
    @Column(name = "FUND_TRANSFER_ERROR_DESC", length = 80)
    private String fundTransferErrorDesc;
    @Column(name = "DO_TXN", length = 1)
    private Character doTxn;
    @Column(name = "RENEW_INTERVAL")
    private Integer renewInterval;
    @Column(name = "EXPIRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;

}

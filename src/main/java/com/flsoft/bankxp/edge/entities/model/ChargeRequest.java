package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "CHARGE_REQUEST")
public class ChargeRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "BANK_ACCOUNT_ID", nullable = true, precision = 38, scale = 0)
    private Long bankAccountId;
    @Column(name = "CHARGE_TYPE_ID", nullable = true, precision = 38, scale = 0)
    private Long chargeTypeId;
    @JoinColumn(name = "CHARGE_TYPE_ID", referencedColumnName = "ID", nullable = true, insertable = false, updatable = false)
    @ManyToOne()
    private ChargeType chargeType;
    @Column(name = "CHARGE_TYPE_CODE", length = 20)
    private String chargeTypeCode;
    @Basic(optional = true)
    @Column(name = "FROM_ACCOUNT", nullable = true, length = 50)
    private String fromAccount;
    @Basic(optional = true)
    @Column(name = "TO_ACCOUNT", nullable = true, length = 50)
    private String toAccount;
    @Column(name = "CHARGE_AMOUNT", precision = 17, scale = 2)
    private Double chargeAmount;
    @Column(name = "AMOUNT", precision = 17, scale = 2)
    private Double amount;
    @Column(name = "AMOUNT_CHANGED_REMARKS", length = 255)
    private String amountChangedRemarks;
    @Basic(optional = false)
    @Column(name = "INITIATOR_BRANCH_ID", nullable = false)
    private Long initiatorBranchId;
    @Basic(optional = false)
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "RECORDED_BY", nullable = false, precision = 22)
    private Long recordedBy;
    @Column(name = "PROCESSED_BY", nullable = true, precision = 22)
    private Long processedBy;
    @Column(name = "PROCESSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedDate;
    @Column(name = "PROCESS_STATUS")
    private Integer processStatus;
    @Column(name = "DO_TXN", length = 1)
    private Character doTxn;
    @Column(name = "TXN_INITIATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnInitiatedDate;
    @Column(name = "EXPIRED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiredDate;
    @Column(name = "REMARKS", length = 255)
    private String remarks;
    @Column(name = "RENEW_INTERVAL")
    private Integer renewInterval;
    @Column(name = "CHARGE_MODE")
    private String chargeMode;
    @Column(name = "EXPIRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @JoinColumn(name = "CHARGE_REQUEST_REF_ID", referencedColumnName = "ID")
    @ManyToOne()
    private ChargeRequest chargeRequestRef;
    @Column(name = "CHARGE_GROUP", nullable = true)
    private String chargeGroup;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private Customer customer;
    @Column(name = "REF_ID", length = 50)
    private String refId;
    @Basic(optional = true)
    @Column(name = "CHARGE_SUB_TYPE", nullable = true, length = 10)
    private String chargeSubType;

    public ChargeRequest() {
    }

    public ChargeRequest(Long id) {
        this.id = id;
    }

}

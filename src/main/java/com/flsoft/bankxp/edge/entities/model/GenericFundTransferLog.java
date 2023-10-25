package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

/**
 * @author Prajwol Hada
 */
@Getter
@Setter
@Entity
@Table(name = "GENERIC_FUND_TRANSFER_LOG")
public class GenericFundTransferLog {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "FROM_ACCOUNT_NUMBER", nullable = false)
    private String fromAccountNumber;
    @Column(name = "TO_ACCOUNT_NUMBER", nullable = false)
    private String toAccountNumber;
    @Column(name = "AMOUNT", nullable = false)
    private Double amount;
    @Column(name = "CHARGE_ACCOUNT_NUMBER")
    private String chargeAccountNumber;
    @Column(name = "CHARGE_AMOUNT")
    private Double chargeAmount;
    @Column(name = "INITIATOR")
    private String initiator;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "TRANSFER_TYPE")
    private String transferType;
    @Column(name = "TRANSFER_ORIGIN")
    private String transferOrigin;
    @Column(name = "RESPONSE_CODE")
    private String responseCode;
    @Column(name = "RESPONSE_MESSAGE")
    private String responseMessage;
    @Column(name = "REQUEST_INFO_ID")
    private Long requestInfoId;
}

package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "TXN_REQUEST_DETAIL")
public class TxnRequestDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "REQUEST_INFO_ID", referencedColumnName = "ID", nullable = false)
    @OneToOne(fetch = FetchType.EAGER)
    private RequestInfo requestInfo;
    @Column(name = "REQUESTED_DATE", length = 30)
    private String requestedDate;
    @OneToMany(mappedBy = "txnRequestDetail")
    private List<TxnRequestParam> txnRequestParams;
    @Column(name = "ACCOUNT_NUMBER", length = 30, nullable = false)
    private String accountNumber;
    @Column(name = "TO_ACCOUNT", length = 30)
    private String toAccount;
    @Column(name = "RECEIVER_MOBILE", length = 30)
    private String receiverMobile;
    @Column(name = "TXN_CODE", length = 32)
    private String txnCode;
    @Column(name = "RECEIVER_NAME", length = 255)
    private String receiverName;
    @Column(name = "CHANNEL", length = 10, nullable = false)
    private String channel;
    @Column(name = "BANK_CODE", length = 20)
    private String bankCode;
    @Column(name = "BRANCH_CODE", length = 20)
    private String branchCode;
    @Column(name = "REMARKS", length = 255)
    private String remarks;
    @Column(name = "AMOUNT", precision = 18, scale = 2)
    private BigDecimal amount;
    @Column(name = "TXN_AMOUNT", precision = 18, scale = 2)
    private BigDecimal txnAmount;
    @Column(name = "ACCOUNT_TOKEN", length = 255)
    private String accountToken;
    @Column(name = "ISSUE_DATE", length = 30)
    private String issueDate;
    @Column(name = "TXN_TYPE", length = 20)
    private String txnType;

    public TxnRequestDetail() {
    }

    public TxnRequestDetail(Long id) {
        this.id = id;
    }

}

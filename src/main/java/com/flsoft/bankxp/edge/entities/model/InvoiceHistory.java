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
@Table(name = "INVOICE_HISTORY")
public class InvoiceHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", nullable = false)
    @ManyToOne()
    private CustomerLogin customerLogin;
    @Column(name = "REFERENCE_CODE", length = 20)
    private String referenceCode;
    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "CHANNEL", length = 20)
    private String channel;
    @Column(name = "PAYMENT_ATTRIBUTE", length = 50)
    private String paymentAttribute;
    @Column(name = "MERCHANT_NAME", length = 50)
    private String merchantName;
    @Column(name = "SERVICE_TYPE", length = 50)
    private String serviceType;
    @Column(name = "TXN_AMOUNT", precision = 17, scale = 2)
    private Double txnAmount;
    @Column(name = "INITIATOR", length = 50)
    private String initiator;
    @Column(name = "FROM_ACCOUNT", length = 50)
    private String fromAccount;
    @Column(name = "TO_ACCOUNT", length = 50)
    private String toAccount;
    @Column(name = "REMARKS", length = 255)
    private String remarks;
    @Column(name = "DESCRIPTION", length = 255)
    private String description;
    @Column(name = "INVOICE", length = 5000)
    private String invoice;
    @Column(name = "TYPE", length = 50)
    private String type;
    @Column(name = "TRANSACTION_NAME", length = 50)
    private String transactionName;
    @Column(name = "RECEIVER_NAME", length = 100)
    private String receiverName;
    @Column(name = "BANK_CODE", length = 50)
    private String bankCode;
    @Column(name = "PAYMENT_DETAILS", columnDefinition = "TEXT")
    private String paymentDetails;
    @Column(name = "ALLOW_REPAYMENT")
    private String allowRepayment;
    @Column(name = "IS_MOBILE")
    private Character isMobile;
    @Column(name = "STATUS")
    private String status;


    public InvoiceHistory() {
    }

    public InvoiceHistory(Long id) {
        this.id = id;
    }

}

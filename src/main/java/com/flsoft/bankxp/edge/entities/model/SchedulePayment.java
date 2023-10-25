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
 * @author gita
 */
@Getter
@Setter
@Entity
@Table(name = "SCHEDULE_PAYMENT")
public class SchedulePayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "FROM_ACCOUNT", length = 200)
    private String fromAccount;
    @Column(name = "TO_ACCOUNT", length = 200)
    private String toAccount;
    @Basic(optional = false)
    @Column(name = "AMOUNT", nullable = false)
    private Double amount;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private CustomerLogin customerLogin;
    @Basic(optional = false)
    @Column(name = "SCHEDULE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduleDate;
    @Column(name = "ACTIVE")
    private Character active;
    @Basic(optional = false)
    @Column(name = "NEXT_PAYMENT_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextPaymentDate;
    @Column(name = "REMARKS", length = 200)
    private String remarks;
    @Column(name = "PAYMENT_CODE", length = 200)
    private String paymentCode;
    @Column(name = "ACCOUNT_ID")
    private Long accountId;
    @Column(name = "TXN_STATE")
    private Integer txnState;
    @JoinColumn(name = "SCHEDULE_PAYMENT_TYPE_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private SchedulePaymentType schedulePaymentType;
    @JoinColumn(name = "SCHEDULE_TYPE_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ScheduleType scheduleType;
    @OneToMany(mappedBy = "schedulePayment", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<SchedulePaymentParameter> schedulePaymentParameters;
    @Column(name = "NAME", length = 200)
    private String name;
    @Column(name = "RECEIVER_NAME", length = 200)
    private String receiverName;
    @Column(name = "RECEIVER_MOBILE", length = 200)
    private String receiverMobile;
    @Column(name = "SERVICE_CODE", length = 50)
    private String serviceCode;
    @Column(name = "BANK_NAME", length = 200)
    private String bankName;
    @Transient
    private String merchantName;
    @Transient
    private String merchantCode;

}

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
@Table(name = "CUSTOMER_TOTAL_TRANSACTION_COUNT")
public class CustomerTotalTransactionCount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Profile profile;
    @Column(name = "TOTAL_AMOUNT")
    private Double totalAmount;
    @Column(name = "TRANSACTION_COUNT")
    private Integer transactionCount;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDateTime;
    @Column(name = "RECORDED_DATE", insertable = false, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date recordedDate;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @Column(name = "CUSTOMER_ID", insertable = false, updatable = false)
    private Long customerId;
    @JoinColumn(name = "CHANNEL_ID")
    @ManyToOne()
    private Channel channel;

}
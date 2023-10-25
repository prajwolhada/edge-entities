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
@Table(name = "CUSTOMER_TRANSACTION_COUNT")
public class CustomerTransactionCount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Profile profile;
    @Basic(optional = false)
    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private Double totalAmount;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_TYPE", nullable = false, length = 20)
    private String transactionType;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_COUNT", nullable = false)
    private Integer transactionCount;
    @JoinColumn(name = "FEATURE_ID")
    @ManyToOne()
    private Feature feature;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDateTime;
    @Column(name = "RECORDED_DATE", insertable = false, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date recordedDate;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @Column(name = "CUSTOMER_ID", precision = 22, insertable = false, updatable = false)
    private Long customerId;
    @JoinColumn(name = "CHANNEL_ID")
    @ManyToOne()
    private Channel channel;

}
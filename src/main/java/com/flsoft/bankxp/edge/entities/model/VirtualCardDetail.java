package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Gaurav Regmi
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "VIRTUAL_CARD_DETAIL")
public class VirtualCardDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 50)
    private String accountNumber;

    @Column(name = "VIRTUAL_ACCOUNT_NUMBER", nullable = false, length = 50)
    private String virtualAccountNumber;

    @Column(name = "CARD_ID", nullable = false, length = 20)
    private String cardId;

    @Column(name = "CARD_NUMBER", nullable = false, length = 20)
    private String cardNumber;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "PAN_NUMBER", nullable = false, length = 50)
    private String panNumber;

    @Column(name = "PAN_IMAGE")
    private String panImage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "APPROVED_DATE")
    private Date approvedDate;

    @Column(name = "APPROVED_BY", insertable = false, updatable = false)
    private Long approvedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REJECTED_DATE")
    private Date rejectedDate;

    @Column(name = "REJECTED_BY", insertable = false, updatable = false)
    private Long rejectedBy;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "REMARKS")
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "APPROVED_BY", referencedColumnName = "ID")
    private ApplicationUser approvedByApplicationUser;

    @ManyToOne
    @JoinColumn(name = "REJECTED_BY", referencedColumnName = "ID")
    private ApplicationUser rejectedByApplicationUser;
}

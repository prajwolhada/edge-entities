package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Gaurav Regmi
 */
@Getter
@Setter
@Entity
@Table(name = "CARD_ENROLLMENT")
public class CardEnrollment implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private String active;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @Column(name = "CARD_ID", nullable = false, length = 200)
    private String cardId;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "IS_PRIMARY", nullable = false, length = 1)
    private Character isPrimary;
    @Column(name = "CARD_ACCOUNT_NUMBER", nullable = true, length = 100)
    private String cardAccountNumber;
    @JoinColumn(name = "CARD_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = true)
    private CardType cardType;
    @Column(name = "TXN_ENABLED", nullable = false, length = 10)
    private Character txnEnabled;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private Customer customer;
    @OneToOne(mappedBy = "cardEnrollment")
    private RegisteredCard registeredCard;
    @Column(name = "VIRTUAL_ACCOUNT_NUMBER", nullable = true, length = 50)
    private String virtualAccountNumber;
}

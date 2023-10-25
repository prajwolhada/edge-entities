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
@Table(name = "FAV_MERCHANT_PAYMENT")
public class FavMerchantPayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Merchant merchant;
    @Basic(optional = false)
    @Column(name = "ACTIVE", length = 1)
    private char active;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(columnDefinition = "TEXT", name = "PAYMENT_DETAILS")
    private String paymentDtails;

    public FavMerchantPayment() {
    }

    public FavMerchantPayment(Long id) {
        this.id = id;
    }

    @PrePersist
    public void initialize() {
        addedDate = new Date();
    }

}

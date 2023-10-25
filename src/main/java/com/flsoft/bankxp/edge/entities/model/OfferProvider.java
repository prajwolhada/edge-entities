package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Narayan Joshi
 * <narayan.joshi@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "OFFER_PROVIDER")
public class OfferProvider implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "MERCHANT_ID")
    private Long merchantId;
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Merchant merchant;
    @JoinColumn(name = "MERCHANT_GROUP_OFFER_ID", referencedColumnName = "ID")
    @ManyToOne()
    private MerchantGroupOffer merchantGroupOffer;

    public OfferProvider() {
    }
}
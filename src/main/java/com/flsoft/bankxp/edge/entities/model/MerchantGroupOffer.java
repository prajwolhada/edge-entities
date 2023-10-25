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
 * @author Narayan Joshi
 * <narayan.joshi@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "MERCHANT_GROUP_OFFER")
public class MerchantGroupOffer implements Serializable {

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
    @Column(name = "OFFER_TAGLINE")
    private String offerTagline;
    @Column(name = "OFFER_TEXT")
    private String offerText;
    @Column(name = "SORT_ORDER")
    private Integer sortOrder;
    @Basic(optional = false)
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private ApplicationUser createdBy;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser lastModifiedBy;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @JoinColumn(name = "MERCHANT_GROUP_ID", referencedColumnName = "ID")
    @ManyToOne
    private MerchantGroup merchantGroup;
    @OneToMany(mappedBy = "merchantGroupOffer", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<OfferProvider> offerProviderList;

    public MerchantGroupOffer() {
    }
}
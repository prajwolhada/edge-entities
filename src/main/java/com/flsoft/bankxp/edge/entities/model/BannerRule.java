package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author prajwol.hada
 */
@Getter
@Setter
@Entity
@Table(name = "BANNER_RULE")
public class BannerRule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @JoinColumn(name = "BANNER_IMAGE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private BannerImage bannerImage;
    @JoinColumn(name = "OFFER_RULE", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private OfferRule offerRule;
    @Column(name = "ENABLED", length = 1)
    private char enabled;

    public BannerRule() {
    }

}

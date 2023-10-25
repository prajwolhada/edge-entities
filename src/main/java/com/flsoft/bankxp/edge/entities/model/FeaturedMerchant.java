package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Sabrin Luitel <sabrin.luitel@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "FEATURED_MERCHANT")
public class FeaturedMerchant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private int id;
    @Column(name = "FEATURE_CODE", length = 80)
    private String featureCode;
    @Column(name = "MERCHANT_CODE", length = 80)
    private String merchantCode;

}

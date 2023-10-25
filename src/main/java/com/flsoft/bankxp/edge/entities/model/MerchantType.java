package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author root
 */
@Getter
@Setter
@Entity
@Table(name = "MERCHANT_TYPE")
public class MerchantType extends AbstractAuditor{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "MERCHANT_TYPE")
    private String merchantType;
    @Basic(optional = false)
    @Column(name = "MERCHANT_TYPE_KEY")
    private String merchantTypeKey;
    @Column(name = "ACTIVE")
    private Character active;

    public MerchantType() {
    }

    public MerchantType(Long id) {
        this.id = id;
    }

    public MerchantType(Long id, String merchantType, String merchantTypeKey) {
        this.id = id;
        this.merchantType = merchantType;
        this.merchantTypeKey = merchantTypeKey;
    }

}
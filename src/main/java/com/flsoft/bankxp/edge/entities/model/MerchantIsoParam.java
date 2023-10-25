package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "MERCHANT_ISO_PARAM")
public class MerchantIsoParam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ISO_FIELD", nullable = false, length = 50)
    private String isoField;
    @Basic(optional = false)
    @Column(name = "PARAMETER", nullable = false, length = 100)
    private String parameter;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private char active;
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Merchant merchant;
    @Column(name = "LENGTH", length = 10)
    private String length;
    @Column(name = "CHARACTERS", length = 100)
    private String characters;

    public MerchantIsoParam() {
    }

    public MerchantIsoParam(Long id) {
        this.id = id;
    }

}

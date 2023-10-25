/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author gita
 */
@Getter
@Setter
@Entity
@Table(name = "FONEPAY_MERCHANT")
public class FonePayMerchant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "MERCHANT_NAME")
    private String merchantName;
    @Basic(optional = false)
    @Column(name = "MERCHANT_CODE")
    private String merchantCode;
    @Basic(optional = false)
    @Column(name = "ACTIVE")
    private Character active;
    @Basic(optional = false)
    @Column(name = "SORT_ORDER")
    private Integer sortOrder;

    public FonePayMerchant() {
    }

    public FonePayMerchant(Long id) {
        this.id = id;
    }

}
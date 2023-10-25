package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Aakash Thakur
 */
@Getter
@Setter
@Entity
@Table(name = "ISO_PARAM_MODIFIER")
public class IsoParamModifier implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private char active;
    @Column(name = "ISO_FIELD")
    private String isoField;
    @Column(name = "PARAMETER")
    private String parameter;
    @Column(name = "LENGTH")
    private String length;
    @Column(name = "CHARACTERS")
    private String characters;
    @Column(name = "MERCHANT_GROUP")
    private String merchantGroup;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "MERCHANT_ID")
    private Long merchantId;
}

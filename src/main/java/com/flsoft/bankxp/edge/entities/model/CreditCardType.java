package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Sabrin Luitel <sabrin.luitel@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "CREDIT_CARD_TYPE")
public class CreditCardType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private int id;
    @Column(name = "CREDIT_TYPE", nullable = false, length = 250)
    private String cardType;
    @Column(name = "BIN_NUMBER", nullable = false, length = 50)
    private String binNumber;
    @Column(name = "REGEX", nullable = false, length = 500)
    private String regex;

}

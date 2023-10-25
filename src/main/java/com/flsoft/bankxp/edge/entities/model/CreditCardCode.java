package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Narayan Joshi
 * <narayan.joshi@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "CREDIT_CARD_CODE")
public class CreditCardCode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private int id;
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private char active;
    @Basic(optional = false)
    @Column(name = "CODE", nullable = false, length = 15)
    private String code;
    @Column(name = "BANK_CODE", nullable = false, length = 15)
    private String bankCode;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 150)
    private String name;
    @Basic(optional = false)
    @Column(name = "SORT_ORDER", nullable = true)
    private Integer sortOrder;
    @JoinColumn(name = "CREDIT_CARD_CODE_ID", referencedColumnName = "ID")
    @OneToMany(fetch = FetchType.EAGER)
    private List<CreditCardType> creditCardType;

    public CreditCardCode() {
    }

}

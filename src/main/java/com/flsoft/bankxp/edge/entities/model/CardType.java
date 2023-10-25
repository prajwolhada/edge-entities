package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Sandhya Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "CARD_TYPE")
public class CardType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "CARD_TYPE_NAME", nullable = false, length = 50)
    private String cardTypeName;
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;
    @Column(name = "ALLOW_TXN", nullable = false, length = 1)
    private Character allowTxn;
    @Column(name = "TYPE", nullable = false, length = 50)
    private String type;
    @Column(name = "IS_CHARGE_FREE", nullable = false, length = 1)
    private Character isChargeFree;
    @Column(name = "CODE", length = 50)
    private String code;

}

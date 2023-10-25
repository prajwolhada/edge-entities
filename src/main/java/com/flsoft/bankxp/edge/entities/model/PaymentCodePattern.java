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
@Table(name = "PAYMENT_CODE_PATTERN")
public class PaymentCodePattern implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "PATTERN")
    private String pattern;
    @Column(name = "TYPE", nullable = false, length = 50)
    private String type;
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    public PaymentCodePattern() {
    }

    public PaymentCodePattern(Long id) {
        this.id = id;
    }
}
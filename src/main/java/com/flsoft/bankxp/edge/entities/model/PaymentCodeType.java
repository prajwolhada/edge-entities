package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "PAYMENT_CODE_TYPE")
public class PaymentCodeType extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "CODE_TYPE_NAME", nullable = false, length = 50)
    private String codeTypeName;
    @Basic(optional = false)
    @Column(name = "CODE_TYPE", nullable = false, length = 50)
    private String codeType;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false)
    private Character active;
    @Column(name = "CODE_PATTERN")
    private String codePattern;
    @JoinColumn(name = "PAYMENT_CODE_PATTERN_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private PaymentCodePattern paymentCodePattern;

    public PaymentCodeType() {
    }

    public PaymentCodeType(Long id) {
        this.id = id;
    }
}
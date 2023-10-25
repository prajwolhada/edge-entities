package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "MOBILE_TOPUP")
public class MobileTopup implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "CODE", nullable = false, length = 50)
    private String code;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 50)
    private Character active;
    @JoinColumn(name = "PAYMENT_CODE_TYPE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private PaymentCodeType paymentCodeType;
}

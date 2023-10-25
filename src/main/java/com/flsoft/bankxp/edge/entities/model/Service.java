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
@Table(name = "SERVICE")
public class Service implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;
    @Basic(optional = false)
    @Column(name = "CODE", nullable = false, length = 100)
    private String code;
    @JoinColumn(name = "SERVICE_PROVIDER_ID", referencedColumnName = "ID")
    @ManyToOne
    private ServiceProvider serviceProvider;
    @JoinColumn(name = "MERCHANT_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne
    private MerchantType merchantType;
    @JoinColumn(name = "PAYMENT_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne
    private PaymentType paymentType;
    @Column(name = "SERVICE_TYPE", nullable = false, length = 100)
    private String serviceType;
    @Column(name = "PAYMENT_GROUP", nullable = false, length = 100)
    private String paymentGroup;

    public Service() {
    }

    public Service(Long id) {
        this.id = id;
    }
}
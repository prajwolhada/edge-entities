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
@Table(name = "MERCHANT_PAYMENT_PARAMETER")
public class MerchantPaymentParameter extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "PARAM_NAME")
    private String paramName;
    @Basic(optional = false)
    @JoinColumn(name = "PAYMENT_CODE_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne
    private PaymentCodeType paymentCodeType;
    @Basic(optional = false)
    @Column(name = "PARAM_ORDER", length = 2)
    private Integer paramOrder;
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Merchant merchant;

    @Column(name = "IS_ACTIVE", length = 2)
    private Character isActive;
    @Column(name = "IS_REQUIRED", nullable = false, length = 1)
    private char required;
    @Basic(optional = false)
    @Column(name = "MAX_LENGTH", nullable = false)
    private Integer maxLength;
    @Column(name = "PLACE_HOLDER")
    private String placeHolder;
    @JoinColumn(name = "DATASET_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.EAGER)
    private Dataset dataset;
    @Column(name = "PARAMETER_TYPE", length = 20)
    private String parameterType;
    @Column(name = "UNICODE_NAME", columnDefinition = "TEXT")
    private String unicodeName;
    @Column(name = "UNICODE_PLACE_HOLDER", columnDefinition = "TEXT")
    private String unicodePlaceHolder;
    @Basic(optional = false)
    @Column(name = "PARAM_CODE")
    private String paramCode;

    public MerchantPaymentParameter() {
    }

    public MerchantPaymentParameter(Long id) {
        this.id = id;
    }

}
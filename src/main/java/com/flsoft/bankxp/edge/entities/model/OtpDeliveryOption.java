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
@Table(name = "OTP_DELIVERY_OPTION")
public class OtpDeliveryOption implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CODE")
    private String code;

    public OtpDeliveryOption() {
    }

    public OtpDeliveryOption(Long id) {
        this.id = id;
    }

}
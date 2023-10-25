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
@Table(name = "CUSTOMER_PASSWORD_RESET_LOG")
public class CustomerPasswordResetLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Basic(optional = false)
    @Column(name = "MOBILE_NUMBER", nullable = false, length = 20)
    private String mobileNumber;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "RESET_TXN_PIN")
    private Character resetTxnPin;
    @Column(name = "RESET_GPRS_LOGIN_PASSWORD")
    private Character resetGprsLoginPassword;

}
